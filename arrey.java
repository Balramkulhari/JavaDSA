public class arrey {
//    class student{
//        String name;
//        int age;
//        student(){
//            System.out.println("default Constructor called");}
//    }
//    //Student(String name, int age ){
//
//    }
//    public static void main(String[] args) {
//        int n = 10; // Number of terms in the Fibonacci series
//        int firstTerm = 0, secondTerm = 1;
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//        for (int i = 1; i <= n; ++i) {
//            System.out.print(firstTerm + " ");
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
//        int result  =0;
//        int number = 153;
//        int digits = String.valueOf(number).length();
//        int orignalnumber = number;
//        while(number!=0){
//            int digit = number%10;
//            result += Math.pow(digit,digits);
//            number /=10;
//        }
//        if(result == orignalnumber){
//            System.out.println("this is armsrtong number" );
//        }
//    }
    public static int trap(int[] height) {
        int n = height.length;
        int lm[] = new int[n];
        lm[0] = height[0];
        for (int i = 1; i < n; i++) {
            lm[i] = Math.max(height[i], lm[i-1]);
        }
        int rm[] = new int[n];
        rm[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(rm[i + 1], height[i]);
        }
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(rm[i], lm[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,6};
        int trap = trap(arr);
        System.out.println(trap);
    }
}

