package day4;

public class arraytraversal {
    static void main() {
        int[] number = {1, 2, 3, 4, 5, 6, 7};


//        A.
//
//                Print every element on a new line.

//        for(int i=1;i<number.length){
//            System.out.println(i);
//        }

//
//                B.
//
//                Print every element on the same line.
//        for(int i=0;i<number.length;i++){
//            System.out.print(number[i] +" ");
//        }
////
//        C.
//
//                Print the array in reverse.

//
//        Expected:
//
//        50 40 30 20 10
//
//        for(int i=number.length-1;i>=0;i--){
//            System.out.print(number[i]);
//        }
//        D. ⭐
//
//        Print only the even elements.
//
//                Expected:
//
//        10 20 30 40 50
        for(int i=0;i<=number.length;i++){
            if (number[i]%2==0){
                System.out.println(number[i]);
            }
        }
//
//
    }
}
