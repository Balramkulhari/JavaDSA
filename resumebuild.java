import org.w3c.dom.ls.LSOutput;

import java.nio.file.LinkPermission;
import java.util.Scanner;
public class resumebuild{
    public static void intro(){
        System.out.println("Hii sir,may i know your name :");
    }
    public static void edu(){
        System.out.println("How much points you want to add here : ");

    }

    public static void main(String[] args) {
        intro();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hi Mr "+ name +" Let me know about your education.");
        edu();
        int nodigree = sc.nextInt();
        sc.nextLine();
        String[] names= new String[nodigree];
        System.out.println("how much points you want to ad here :");
        for(int i =0; i<nodigree; i++){
            names[i] = sc.nextLine();
        }
        System.out.println("Educational qualifications");
        for(String elements : names){
//            System.out.println(elements);
        }
        sc.close();
        }

    }

