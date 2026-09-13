package day5;
import java.util.Scanner;

public class sTRINGbASICS {
    public static void main(String[] args) {
//         Takes a full name from the user. Scanner

   Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("hello "+name);

   



// Prints the length.

        System.out.println(name.length());
// Prints the first character.
        System.out.println(name.charAt(0));
// Prints the last character.
        System.out.println(name.charAt(name.length()-1));
// Prints every character on a separate line.
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    
    
}
