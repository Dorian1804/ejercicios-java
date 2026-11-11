import java.util.Arrays;

/** Binary search over integers supplied on the command line. */
public final class BinarySearch {
    public static int search(int[] sorted, int target) {
        int left = 0, right = sorted.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (sorted[middle] == target) return middle;
            if (sorted[middle] < target) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java BinarySearch TARGET NUMBER [NUMBER ...]");
            System.exit(2);
        }
        try {
            int target = Integer.parseInt(args[0]);
            int[] numbers = new int[args.length - 1];
            for (int i = 1; i < args.length; i++) numbers[i - 1] = Integer.parseInt(args[i]);
            Arrays.sort(numbers);
            System.out.println("Sorted values: " + Arrays.toString(numbers));
            int index = search(numbers, target);
            System.out.println(index < 0 ? "Not found" : "Found at zero-based sorted index: " + index);
        } catch (NumberFormatException error) {
            System.err.println("All arguments must be valid 32-bit integers.");
            System.exit(2);
        }
    }
}
