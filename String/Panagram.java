public class Panagram {
    public static boolean isPanagram(String str) {
        str = str.toLowerCase();
        int n = str.length();
        boolean[] present = new boolean[26];

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                present[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                return false; 
            }
        }

        return true; // all letters found
    }
}
