class Solution {
    public int smallestNumber(int n, int t) {
        if(n==100) return 100;
        if(n==0) return 0;
        for(int i = n ;i<n+10;i++){
            String s = ""+n;
            if(s.length()<2){
                if((s.charAt(0) - '0')%t==0){
                    return n;
                }
            }
            else if(s.length()>=2){
            int p = (s.charAt(0) - '0') * (s.charAt(1) - '0');
                if(p%t==0){
                    return n;
                }
            }
            n++;
        }
        return -1;
    }
}