public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,11,12,14,20,36,48};
        System.out.println(binarysearch(arr, 11));
    }
static int binarysearch(int[] arr, int target){
   int start=0;
   int end=arr.length-1;
   while(start<=end){//find the middle element
    //might be possible that start+end 
int mid=start+(end-start)/2;
if(target<arr[mid]){
    end=mid-1;
}
else if(target>arr[mid]){
  start=mid+1;  

}else{
    return mid;
}

}
return -1;
}
}
