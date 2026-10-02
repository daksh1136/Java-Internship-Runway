package day7;

public class basic{
    public static void main(String[] args) {
        int i =0;
        int j=18;
        try{
        System.out.println(j/i);

    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException");


    }
    System.out.println("Program continues...");

}
}