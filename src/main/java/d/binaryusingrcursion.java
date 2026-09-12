package d;


public class binaryusingrcursion {
    static void binary(int arr[],int key,int srt,int end){
        if(srt>end){
            System.out.println("key not found");
        return;}


        int mid=(srt+end)/2;
        if (arr[mid]==key){
            System.out.println("key found");
            System.out.println(" at index "+arr[mid]);


        }
         else if(key<arr[mid]) {

            binary(arr,key, srt, mid - 1);
         }else if(key>arr[mid]){
            binary( arr,key,mid+1,end);
         }
    }
    static void main() {
        int arr[]={1,2,3,22,4,5,6,7,8,9,10};

        binary(arr,69,0,arr.length-1);


    }
}
