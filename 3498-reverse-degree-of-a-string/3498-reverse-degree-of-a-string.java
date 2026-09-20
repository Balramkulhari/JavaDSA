class Solution {
    public int reverseDegree(String s) {
        int d =0;
        for(int i = 0; i<s.length();i++){
            int ascii = s.charAt(i)-97;
            d += (i+1)*(26-ascii);
        }
        return d;
    }
}