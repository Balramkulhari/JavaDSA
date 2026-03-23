
public class practical {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    // Parent Class
    class Parent {
        void display() {
            System.out.println("This is the Parent class.");
        }
    }

    // Child Class
    class Child extends Parent {
        void show() {
            System.out.println("This is the Child class.");
        }
    }


    public static void main(String[] args) {
//        int n = 4;
//        long fact = 1;
//        for(int i = 1; i<=n ; i++){
//            fact = fact*i;
//        }
//        System.out.println("the factorial of number is "+fact);
//
//        System.out.println("Factorial of " + n + " is: " + factorial(n));
isPrime(32);

//reverse of any number
//        int n  = 12445423;
//        int rev = 0;
//        while(n>0){
//            int lstdigit =  n%10;
//             rev = (rev*10)+lstdigit;
//            n = n/10;
//        }
//        System.out.print(rev);
//

//deciaml to bianry ,octal hexadecimal , sara chod yahi hai  ;;
//        int decimal = 9;
//        String binary = Integer.toBinaryString(decimal);
//        String octal = Integer.toOctalString(decimal);
//        String HexDECIMAL = Integer.toHexString(decimal);
//        System.out.println("Binary representation: " + binary);
//        System.out.println("octal representation: " + octal);
//        System.out.println("hexadecoaml  representation: " + HexDECIMAL);
//        int binarytodecimal = Integer.parseInt(binary,2);
//        int hexadecimalTodecimal = Integer.parseInt(HexDECIMAL,16);
//        int octaltodecimal = Integer.parseInt(octal,8);
//        System.out.println( "binarytodecimal :"+ binarytodecimal );
//        System.out.println( "hexadecimalTodecimal: "+ hexadecimalTodecimal );
//        System.out.println( "octaltodecimal :"+ octaltodecimal );

// reverse of a string
//        String name = "balllu";
//        String reversed = "";
//        for (int i = name.length() - 1; i >= 0; i--) {
//            reversed += name.charAt(i); // Add each character in reverse order
//        }
//
//        System.out.println("Reversed string: " + reversed);


//string upper case and lower case
//        String name = " balram ";
//        String capital = name.toUpperCase();
//        String lowerCase = name.toLowerCase();
//        System.out.println("capitalized : "+ capital );
//        System.out.println("lower cased : "+ lowerCase);

// operations on arrey
        //reverse of arrey
        int arr[] = { 2 ,3 ,4, 5, 6, 7};
        int n = arr.length;
        for( int i = n-1 ; i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("even numbers");
        for(int elemets:arr){
            if(elemets%2==0){
                System.out.print(elemets);
            }
        }
        System.out.println();
        System.out.println("odd numbers");
        for(int elemets:arr){
            if(elemets%2!=0){
                System.out.print(elemets);
            }
        }
        System.out.println();
                int min = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.println("min ="+min);
        System.out.println();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min ="+max);
        System.out.println();
        int[] array = {2, 10, 17, 21, 29, 33, 5, 8}; // Example array
            System.out.println("Prime numbers in the array:");
            for (int num : array) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }








