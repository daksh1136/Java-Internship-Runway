package day5;

import java.util.Scanner;

public class testanalyzer {
    static void main() {

//
//        🎯 Mini Project — Text Analyzer
//
//        Create:
//
//        Day5/TextAnalyzer.java
//
//        Your program should take a sentence from the user and calculate:


        Scanner sc=new Scanner(System.in);
        int spaces=0;
        int vowel=0;
        int constant=0;
        int digit=0;
        String text="dakhs222";

//
//        Total characters
        System.out.println("the total chaacter are "+text.length());
//        Number of vowels
        for(int i=0;i<text.length();i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vowel++;


            } else {
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    constant++;
                }

            }
        }
        System.out.println("there are "+vowel+"vowels in full text");
//        Number of consonants
        System.out.println("there are "+constant+"constnt in full text");

//        Number of digits
        for(int i=0;i<text.length();i++) {
            if(Character.isDigit(text.charAt(i))){
                digit++;
            }
            if (text.charAt(i) ==' ') {
                spaces++;
            }

        }
        System.out.println(
                "there are "+digit+"in the string"
        );


//        Number of spaces
        System.out.println(spaces);

//        Reverse of the String
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<text.length();i++){
            sb.append(text.charAt(i));




        }
        sb.reverse();
        System.out.println(sb);
//        Whether it is a palindrome

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
