import com.sun.source.doctree.EscapeTree;
import java.lang.Math;
import java.util.Scanner;

public class assignmnt {//BINARY TO DECIMAL
//    public static void bintodec(int binum ) {
//        int pow = 0;
//        int decn = 0;
//        while (binum > 0) {
//            int lsd = binum % 10;
//            decn = decn + (lsd * (int) Math.pow(2, pow));
//            pow++;
//            binum = binum / 10;
//        }
//        System.out.println("the decimal of " + decn + "is" + binum);
//    }


    public static void main(String[] args) {
//        bintodec(101);
//
////    day4
//    int a = 12;
//    int b = 23;
//    int c = 43;
//    if((a>=b)&&(a<=c)){
//        System.out.println("a is the largest number ");
//    }
//    else if(b>c){
//        System.out.println("b is the gratest");
//    }
//    else{
//        System.out.println("c is the largest");
//    }
//printing number  1 to n using while loop :
//    Scanner sc = new Scanner(System.in);
//        System.out.println("enter the nth number");
//    int n = sc.nextInt();
//    int c= 1;
//    while(c<=n){
//        System.out.println(c);
//        c++;
//    }
//    System.out.println();

//sum of first n netural numbers
//        int n = 15;
//        int value = 1;
//        int sum = 0;
//        while (value <= n) {
//            sum = sum + value;
//            value = value + 1;
//        }
//        System.out.println("the sum of n netural numbers :"+sum);
        //pattern printing (square )
//        int line = 1;
//        for(line=1;line<=4;line++){
//            System.out.println("****");
//        }

//reverse of a number
//        int n = 1243545;
//        while(n>0){
//            int lastdigit=n%10;
//            System.out.print(lastdigit);
//            n=n/10;
//
//        }
//        System.out.println();
//rev 2
        int n = 10899;
        int rev = 0;
//        while(n>0) {
//            int lstdigit = n % 10;
//            rev = (rev*10)+lstdigit;
//            n = n/10;
//        }
//        System.out.println("the reverse of the number is :"+rev);
//
////
//} using for loop
//        int n = 0435;
//        int rev= 0;
        for (; n > 0; n /= 10) {
            int lstdigit = n % 10;
            rev = (rev * 10) + lstdigit;
        }
        System.out.println("The reverse of the number is: " + rev);



//do  while loop;
//        int c = 1;
//        do{
//            System.out.println("hw");
//            c++;
//        }while (c<=10);
//        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("enter a number");
//            int n = sc.nextInt();
//            if(n%10==0){
////                break;
////                continue;
//            }
//            System.out.println("number was :"+n);
//        }while(true);



//code for prime number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        if(n==2){
//            System.out.println(" it's prime ");
//        }
//        else {
//            boolean isprime=true;
//            for(int i = 2;i<n-1;i++) {
//                if (n % i == 0) {
//                    isprime = false;
//                }
//            }
//            if(isprime==true){
//                System.out.println("number is prime ");
//            }
//            else{
//                System.out.println("not prime");
//            }
//        }

//to find the sum of even and odd numbers from a set a given set of
//        numbers
//        Scanner sc = new Scanner(System.in);
//        int evensum = 0;int oddsum= 0;
//        System.out.println("Enter number (0 to quit)");
//        while(true){
//            int num = sc.nextInt();
//            if (num==0){
//                break;
//            }
//            if(num%2==0){
//                evensum+=num;
//            }
//            else{
//                oddsum+=num;
//            }
//        }
//        sc.close();
//        System.out.println("Sum of even numbers: " + evensum);
//        System.out.println("Sum of odd numbers: " + oddsum);

// factoral of a number
//        System.out.print("enter a number  to find factorial :");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long fact = 1;
//        for(int i= 1;i<=n;i++){
//            fact*=i;
//        }
//        System.out.println("the factorial of the number is :"+fact);
//multiplication table of a number
//        System.out.print("enter a number  to multiplication table :");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =1;i<=10;i++){
//            System.out.println(i+"x"+n+"="+i*n);
//        }


//
//
//
}}

