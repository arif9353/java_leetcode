public class PalindromeRecursion {
    public boolean isPalindrome(String s) {
        String convertedString = convertString(s);
        return isPalindromeRecursive(convertedString, 0, convertedString.length() - 1);
    }

    public static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public String convertString(String s) {
        // Convert to lowercase
        s = s.toLowerCase();
        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");
        return s;
    }

    public static void main(String[] args) {
        PalindromeRecursion sol = new PalindromeRecursion();
        String input = "A man, a plan, a canal: Panama";
        if (sol.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
