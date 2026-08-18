class Solution {
    public int vowelConsonantScore(String s) {
        int cons = 0;
        int v = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (Character.isDigit(c) || c == ' ') {
                continue; // skip numbers and spaces
            } else if (isVowel(c)) {
                v++;
            } else if (Character.isLetter(c)) {
                cons++;
            }
        }

        if (cons == 0) return 0;
        return (int) Math.floor((double) v / cons);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
