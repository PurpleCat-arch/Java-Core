public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
        // build char count bucket
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }
        // find the index
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("First unique character index in '" + s + "': " + firstUniqChar(s));

        s = "loveleetcode";
        System.out.println("First unique character index in '" + s + "': " + firstUniqChar(s));
    }
}
