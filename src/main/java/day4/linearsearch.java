package day4;

public class linearsearch {
    static void main() {
        int key=34;
        int array[]={1,2,3,4,5,55433,3,2334,34,34,3};
        for (int i = 0; i < array.length; i++) {
             if(array[i]==key){
                 int place=i;
                 System.out.println("found at :"+ place);
             }

        }
    }
}
