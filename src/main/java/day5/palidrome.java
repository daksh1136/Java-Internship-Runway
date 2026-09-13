package day5;

import java.util.Scanner;

public class palidrome {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int left=0;
        int right=text.length()-1;
        boolean palidrom=true;
        while(left<right){
            if(text.charAt(left)!=text.charAt(right)){
                palidrom=false;
            }
            left++;
            right--;
        }
        if(palidrom){
            System.out.println("this is s palidrome");
        }else{
            System.out.println("not a palidrome");
        }
    }
}