import java.text.Normalizer;
import java.util.Locale;

/** Unicode-aware text statistics and a normalized palindrome check. */
public final class TextInspector {
    public static boolean isPalindrome(String text) {
        String normalized = Normalizer.normalize(text, Normalizer.Form.NFD)
            .replaceAll("\\p{M}", "").toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]", "");
        return !normalized.isEmpty() && normalized.contentEquals(new StringBuilder(normalized).reverse());
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java TextInspector TEXT");
            System.exit(2);
        }
        String text = String.join(" ", args).trim();
        long letters = text.codePoints().filter(Character::isLetter).count();
        long digits = text.codePoints().filter(Character::isDigit).count();
        int words = text.isEmpty() ? 0 : text.split("\\s+").length;
        System.out.println("Code points: " + text.codePointCount(0, text.length()));
        System.out.println("Words: " + words);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Normalized palindrome: " + isPalindrome(text));
    }
}
