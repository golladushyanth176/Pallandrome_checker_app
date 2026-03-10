public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String text = "A man a plan a canal Panama";

        // Normalize the string: remove spaces & special characters, convert to lowercase
        String normalized = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + text + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string \"" + text + "\" is NOT a Palindrome.");
        }
    }
}