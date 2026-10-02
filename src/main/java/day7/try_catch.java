package day7;
//exxercise 2

public class try_catch {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        System.out.println();


        int arr[];
        arr = new int[5];
        try{
        arr[5] = 10;}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        } 
        System.out.println("contuinue");
       }
    
}