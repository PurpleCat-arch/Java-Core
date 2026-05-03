public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' anagrams? " + isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Are '" + s2 + "' and '" + t2 + "' anagrams? " + isAnagram(s2, t2));
    }
}
