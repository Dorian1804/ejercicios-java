/** Simple command-line unit conversions with explicit input validation. */
public final class UnitConverter {
    public static double convert(String operation, double value) {
        if (!Double.isFinite(value)) throw new IllegalArgumentException("Value must be finite.");
        switch (operation) {
            case "c-to-f": return value * 9 / 5 + 32;
            case "f-to-c": return (value - 32) * 5 / 9;
            case "km-to-mi":
                if (value < 0) throw new IllegalArgumentException("Distance must be nonnegative.");
                return value / 1.609344;
            case "mi-to-km":
                if (value < 0) throw new IllegalArgumentException("Distance must be nonnegative.");
                return value * 1.609344;
            default: throw new IllegalArgumentException("Choose c-to-f, f-to-c, km-to-mi or mi-to-km.");
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java UnitConverter OPERATION VALUE");
            System.exit(2);
        }
        try {
            double result = convert(args[0], Double.parseDouble(args[1]));
            if (!Double.isFinite(result)) throw new IllegalArgumentException("Result exceeds numeric range.");
            System.out.printf(java.util.Locale.ROOT, "%.6f%n", result);
        } catch (IllegalArgumentException error) {
            System.err.println(error.getMessage());
            System.exit(2);
        }
    }
}
