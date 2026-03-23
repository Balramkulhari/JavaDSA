import java.util.Scanner;
class EH{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        System.out.println("enter a number to divide by this ");
        float m = sc.nextInt();
//        int d = (m/n);

        try{
            float d = (n/m);
            System.out.println("the answer is :" +d);
        }
        catch(ArithmeticException d){
            System.out.println("Can't divided by zero");
        }





    }
}