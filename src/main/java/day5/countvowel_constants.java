package day5;

public class countvowel_constants {
    static void main() {
        int vowel=0;
        int constant=0;
        String text="daeiouksh";
        for(int i=0;i<text.length();i++){
        if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='0'||text.charAt(i)=='u'){
            vowel++;


        }else{
            if(text.charAt(i)>='a'&&text.charAt(i)<='z'){
                constant++;
            }

        }
        }


        System.out.println(text);
        System.out.println(vowel+"are the total no. of vowel in the text");
        System.out.println(constant+"are the no. of constant present in text");

        ;
    }
}
