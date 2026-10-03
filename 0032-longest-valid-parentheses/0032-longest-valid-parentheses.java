class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int open = 0;
        int close =0;
        //left to right 
        int result =0;
        for(int i =0;i<n ;i++){
            if(s.charAt(i)=='(') open++;
            else close++;
            if(open == close){
                result = (result > open+close) ? result : open+close ;
            }
            else if (close>open){
                open =close= 0;
            }
        }
        // right to left 
        open = 0;
        close =0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='(') open++;
            else close++;
            if(close==open){
                result = result = (result > open+close) ? result : open+close;
            }
            else if(open>close){
                close = open =0;
            }
        }
        return result;
    }
}