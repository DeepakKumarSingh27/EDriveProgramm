package RaghuSir.String;

public class Str9 {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "example string"; // Input string
        char ch = 'e'; // Character to count

        int occurrences = countOccurrences(str, ch);

        System.out.println("The character '" + ch + "' appears " + occurrences + " times in the string.");
    }
}


