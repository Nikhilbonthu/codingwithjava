import java.util.*;
public class MaxValueOfArrays {
  public static void main(String[] args) {
    int[] arr={1,3,23,9,28,65};
    System.out.println(max(arr));
    System.out.println(maxRange(arr, 1, 3));
    reverse(arr);
    System.out.println(Arrays.toString(arr));
  }  
  static int max(int[] arr){
int max=arr[0];
    for(int i=1; i<arr.length; i++){
    if(arr[i]>max)
    {
max=arr[i];
    }
    }
    return max;
  }
  static int maxRange(int[] arr,int start,int end){
    int max=arr[start];
        for(int i=start; i<end; i++){
        if(arr[i]>max)
        {
    max=arr[i];
        }
        }
        return max;
}
static void reverse(int[] arr){
    int start=0;
    int end=arr.length-1;
    while(start<end){
        swap(arr,start,end);
        start++;
        end--;
    }

}
static void swap(int[] arr,int index1,int index2){
    int temp1 = arr[index1];
    arr[index1] = arr[index2];
    arr[index2]=temp1;
}


}
