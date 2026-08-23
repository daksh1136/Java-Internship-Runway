package day4;

public class sumandaverage {
    static void main() {
        int sum=0;
        /// //sum of all element of aarrray
        int []array={1,2,3,4,5,6,7,7,89};
        for (int i=0;i<=array.length-1;i++){
            sum+= array[i];

        }
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);

        }
        System.out.println("the sum of the whole array  is "+ sum);

        double avg=sum/ array.length;
        System.out.println("the avegrage of the array is :"+avg);
    }
}
