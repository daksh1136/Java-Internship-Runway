package day2;
import java.util.*;

public class ATm {
    static void main() {
        int value=1000;

        Scanner Sc=new Scanner(System.in);

        while(true) {
            System.out.println("hii");
            System.out.println("Welcome To Lena Dena Bank!!!!!!");
            System.out.println(" 1.view \n 2.deposit\n  3.widhrawal");
            System.out.println("what do u want to do from above option: ");
            int note=Sc.nextInt();
            switch (note) {
                case 1:
                    System.out.println("your currrent balance is " + value);
                    break;


                case 2:
                    int depos = Sc.nextInt();

                    System.out.println("enter your cassh amount");

                    value = value + depos;
                    System.out.println("deposited");
                    break;

                case 3:
                    System.out.println("enter amount  widhrawl");
                    int withdrawl = Sc.nextInt();
                    value = value - withdrawl;
                    System.out.println("witshrwal the amount ");

                default:
                    break;
            }
        }

    }
}
