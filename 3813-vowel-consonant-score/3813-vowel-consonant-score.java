class Solution {
    public int vowelConsonantScore(String s) {
        

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if(c >= 'a' && c <= 'z') {
                  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
                else {
                    consonants++;
                }

            }
        }

    if (consonants == 0) {
            return 0;
        }

        return vowels / consonants;

    }
}