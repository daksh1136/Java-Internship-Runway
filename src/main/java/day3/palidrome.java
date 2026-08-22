package day3;

import java.util.Scanner;

public class palidrome {
    static void main() {

            Scanner sc= new Scanner(System.in);
            int number = sc.nextInt();
            int digit=0;

            int n=number;
            int remainder=0;
            while(n>0){
                remainder=n%10;
                digit=digit*10+remainder;
                n=n/10;


            }
            if(digit==number){
                System.out.println("this is palidrome");

            }else{
                System.out.println("not a palidrome");
            }
            System.out.println("the revrse of number us:"+ digit);
    }
}
