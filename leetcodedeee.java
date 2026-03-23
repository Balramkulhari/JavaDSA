import java.util.Arrays;

class leetcodedeee {
    public static boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String Rev = new StringBuilder(num).reverse().toString();
        if(num.equals(Rev)){
            return true;
        }
        return false;
    }

    public static int mySqrt(int x) {
        return (int)Math.floor(Math.sqrt(x));

    }

    public void reverseString(char[] s) {
        int n = s.length-1;
        int l = 0;
        while(n>0){
            char temp = s[l];
            s[l] = s[n];
            s[n] = temp;
            l++;
            n--;

        }
    }

    public boolean isValid(String s) {
        if(s.contains("[{(")&&s.contains("]})")){
            return true;
        }
        return false;

    }
    public static int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int last = x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev = (rev*10)+last;
            x = x/10;
        }
        return rev;

    }

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1 ;i>=0;i++){
            sb.append(i);
        }
        return sb.toString();

    }

    public int[] twoSum(int[] nums, int targt) {
        Arrays.sort(nums);
        int l = 0,r = nums.length-1;
        while(l<r){
            if(nums[r]+nums[l] == targt){
                return new int[]{r,l};
            }
            else if(nums[r]+nums[l] < targt){
                l++;
            }
            else{
                r--;
            }

        }
        return new int [] {l,r};
    }

    public int findMin(int[] nums) {
        int min = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i]<min){
                nums[i] = min;
                return min;
            }
        }
        return min;

    }
    public double myPow(double x, int n) {
        if(n<0){long binary = n;
            double ans = 0.5;
            while(binary>0){
                if(binary%2==1){
                    ans*=x;
                }
                x*=x;
                binary /=2;
            }
            return ans;

        }
        long binary = n;
        double ans = 1;
        while(binary>0){
            if(binary%2==1){
                ans*=x;
            }
            x*=x;
            binary /=2;
        }
        return ans;


    }

    public static int[] merge(int arr1[] , int arr2[] ){
        int[] mergerd = new int [arr1.length+arr2.length];
        for(int i = 0;i<arr1.length;i++){
            mergerd[i] = arr1[i];

        }
        for(int i = 0 ; i<arr2.length;i++){
            mergerd[arr1.length+i] =arr2[i];
        }
        return mergerd;
    }
    public static int maxArea(int[] height) {
        int result  =0;
        int leftindex = 0 , rightindex = height.length-1;
        while(leftindex<rightindex){
            int left = height[leftindex];
            int right = height[rightindex];
            int area = Math.min(left,right)*(rightindex-leftindex);
            result = Math.max(area,result);
            if(left<right)  leftindex++;
            else rightindex--;
        }
        return result;
    }
    public static int ClearIthBit(int n , int i ){
        return n&(~1<<i);
    }
    public static int setIthBit(int n , int i){
        return n|(1<<i);
    }
    public static int updateIthBit(int n, int i , int bit){
        if(bit==0) return ClearIthBit(n,i);
        else return setIthBit( n , i);
    }
    public static int ClearLastIBits(int n , int i ){
        int bit = (~0)<<i;
        return n&bit;
    }
    public static int  ClearInRange(int n , int i , int j){
        int a= ((~0)<<i);
        int b = (1<<i)-1;
        int bit = a|b;
        return n&bit;}
    public static int findPeakElement(int[] nums) {
        int max1 = 0;
        for(int i = 1 ; i<nums.length;i++){
            if(nums[i]>max1)
                max1 = i;
        }
        return max1;

    }
    public String clearDigits(String s) {
        StringBuilder NonDigit = new StringBuilder();
        for(int i = 0 ;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c)){
                if(NonDigit.length()>0){
                    NonDigit.setLength(NonDigit.length()-1);
                }
                else{
                    NonDigit.append(c);
                }
            }
            ;
        }
        return NonDigit.toString();
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            if((n&1) !=0){
                count++;
                n<<=1;
            }
        }
        return count;

    }
    public String S(String num1, String num2) {
        double sum = Integer.parseInt(num1)+Integer.parseInt(num2);
        return String.valueOf(sum);

    }
    public static int[] productExceptSelf(int[] nums) {
        int j = 0;
        int arr[] = new int[nums.length-1];
        int multiply = 1;
        for(int i =0 ;i<nums.length-1;i++){
            j++;
            multiply = nums[i]*nums[i+1]/j;
            arr[i] = multiply;
        }
        return arr;
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            i--;
            j--;

        }
        return sb.reverse().toString();
    }

    public static String removeDuplicateLetters(String s) {
        int index = 0 ;
        StringBuilder sb = new StringBuilder();
        int n = s.length()-1;
        while(n<0){
            if(sb.toString().indexOf(s.charAt(index))!=-1){
                sb.append(s.charAt(index));
            }
            else{
                continue;
            }
        }
        return sb.toString();
    }
    public static int DuplicateNum(int [] nums){
        int l = 1,high = nums.length-1;
        while(l<high){
            int mid = l+(high-l)/2;
            int count = 0;
            for(int  i = 0;i<high+1;i++){
                if(nums[i]<=mid) count++;
            }
            if(count>mid){
                high = mid;
            }
            else {
                l = mid+1;
            }
        }
        return l;
    }
    public String reverseVowels(String s) {
        int i = 0 , j = s.length()-1;
        char ch[] = s.toCharArray();
        while(i<j){
            if(!isVovel(ch[i])){
                i++;
            }
            else if(!isVovel(ch[j])){
                j--;
            }
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j++;

            }
        }
        return String.valueOf(ch);
    }
    public static boolean isVovel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
        return false;
    }

    public int nthUglyNumber(int n) {
        int arr[] = new int[n];
        for(int i = 0 ;i<=n;i++){
                while (n % 2 == 0) n /= 2;
                while (n % 3 == 0) n /= 3;
                while (n % 5 == 0) n /= 5;
        }
        for( int j = 0;j<n;j++){
            arr[j] = arr[n];
        }
        return arr[n];
    }





    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},
                {1,0,1},{
                1,1,1}};
        int n =14;
        int arr[] = {1,2,3,5,2};
        System.out.println(DuplicateNum(arr));
//        System.out.println(hammingWeight(n));
//        int[] nms = {1,2,3,4};
//        System.out.println(productExceptSelf(nms));
        String s = "asdasd";
//        System.out.println(removeDuplicateLetters(s));





        int []nums = {0,2,0,6,3,2,8};
//        System.out.println(findPeakElement(nums));
        int []nums2 = {3,2,1,0,4};
//        System.out.println( ClearInRange(10 , 2, 4));
//        System.out.println(updateIthBit(10,2,1));
//        int[] result = merge(nums,nums2);
//        System.out.println(ClearLastIBits(6,2));
//        System.out.println(isPalindrome(nums));
//        System.out.println(plusOne(nums));
        String S1= "axc12";
        String S2= "ahbgdc";
        int x = -1238;
//        System.out.println(reverse(x));
//        System.out.println(mySqrt(x));
//        System.out.println(isValid(S1));

    }}

//2,184,901 leetcode rank on date 2Aug


