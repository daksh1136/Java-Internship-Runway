package day3;
import java.util.Scanner;

public class forloop {
    static void main() {
//
//
//        Write programs to:
//
//        A.
//
//                Print numbers from 1 to 10

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
//
//        B.
//
//                Print numbers from 10 to 1
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
////
//        C.
//
//                Print all even numbers from 1 to 20
        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
//
//        D.
//
//                Print the multiplication table of a number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which u want table:");
        int n = sc.nextInt();
        for (int i =1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + i * n);

        }
    }
}
