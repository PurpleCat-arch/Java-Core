public class ReverseWordsInString {
    public static String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        // Split by multiple spaces
        String[] words = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("Original: '" + s + "'");
        System.out.println("Reversed: '" + reverseWords(s) + "'");
        
        s = "  hello world  ";
        System.out.println("Original: '" + s + "'");
        System.out.println("Reversed: '" + reverseWords(s) + "'");
    }
}
