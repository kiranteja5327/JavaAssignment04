//7. WAP to find if String contains all unique characters.

public class Lanch07 {
    public static void main(String[] args) {
        String str = "hello world";
        boolean hasUniqueChars = hasAllUniqueChars(str);
        if (hasUniqueChars) {
            System.out.println("The string \"" + str + "\" contains all unique characters.");
        } else {
            System.out.println("The string \"" + str + "\" does not contain all unique characters.");
        }
    }

    private static boolean hasAllUniqueChars(String str) {
        // Create a boolean array to keep track of seen characters
        boolean[] seenChars = new boolean[256]; // assuming ASCII characters
        
        // Iterate over the string and mark each character as seen
        for (int i = 0; i < str.length(); i++) {
            int charValue = (int) str.charAt(i);
            if (seenChars[charValue]) {
                // If the character has been seen before, return false
                return false;
            } else {
                // Mark the character as seen
                seenChars[charValue] = true;
            }
        }
        
        // If we get to this point, all characters are unique
        return true;
    }
}
