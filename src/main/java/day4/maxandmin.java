package day4;

import java.util.Scanner;

public class maxandmin {
    static void main() {
        Scanner sc=new Scanner(System.in);


        int[] array = {1, 3, 4, 5, 6, 767, 667, 5, 4, 3, 2, 3, 0};
        System.out.println("what u want to do chooose below .");
        System.out.println("1, max  \n2. min");
        int chnoose=sc.nextInt();
        switch (chnoose){
            case 1:
                int max=array[0];
                for (int i=0;i<array.length;i++){
                    if(max<array[i]){
                        max=array[i];


                    }
                }
                System.out.println("maximum in the array is :"+max);



            case 2:
                int min=array[0];
                for (int i=0;i<array.length;i++){
                    if(min>array[i]){
                        min=array[i];


                    }
                }
                System.out.println("minimum in the array is :"+min);

            default:
                break;
        }
    }
}
