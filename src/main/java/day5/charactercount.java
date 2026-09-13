package day5;

public class charactercount  {
    static void main() {
        int count=0;
        String text="programming";
        char target='m';
        System.out.println(text);
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==target){
                count++;

            }

        }
        System.out.println(target+" is appearing "+count+"times");
    }
}
