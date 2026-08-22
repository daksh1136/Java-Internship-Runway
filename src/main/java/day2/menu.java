package day2;
import java.util.Scanner;
import java.util.Scanner;

public class menu {
    static void main() {
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("welcome to calculator");
            System.out.println("1. add\n 2. sub\n 3.mult\n  4. divide");
            System.out.println("enter your choice:");
            int choice= sc.nextInt();
            System.out.println("enter the  first number");
            int n1= sc.nextInt();
            System.out.println("enter the second number");
            int n2= sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println(n1+n2);
                    break;
                    case 2:
                        System.out.println(n1-n2);
                        break;
                case 3:
                    System.out.println(n1*n2);
                    break;
                case 4:
                    System.out.println(n1/n2);
                    break;
                default:
                    break;



            }
        }

    }
}
