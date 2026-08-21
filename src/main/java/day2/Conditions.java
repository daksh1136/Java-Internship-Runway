package day2;
import java.util.Scanner;
public class Conditions {
    static void main() {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your ageee:");
        age=sc.nextInt();
//        if(age>=18){
//            System.out.println("eligible");
//        }
//        else{
//            System.out.println("not eligible");
//        }
        String sage=age>=18?"eligible":"not eligible";
        System.out.println(sage);


    }
}
