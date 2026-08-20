package day1;
import java.util.Scanner;


public class studentInput {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
         int age=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("enter your college name");
        String college=sc.nextLine();
        System.out.println("enter your cgpa");
        double cgpa=sc.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(college);
        System.out.println(cgpa);



//        Name
//                Age
//        College
//                CGPA
    }
}
