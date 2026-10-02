package day7;

public class try_multicatch {
    public static void main(String[] args) {
        int i=8;
        int j=10;
        int[] arr;
        arr = new int[5];
        try{
            System.out.println(i/j);
            System.out.println(arr[3]);


        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }catch(Exception e){
            System.out.println("STAY IN YOUR LIMITS");
        }


    }
}
    


    

    

