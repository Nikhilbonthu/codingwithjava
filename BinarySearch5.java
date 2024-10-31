//find first and last position of elemnt in sorted array

import java.util.Arrays;

public class BinarySearch5 {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
    static int[] searchRange(int[] arr,int target){
       int[] ans={-1,-1};
       int start=search1(arr, target,true);
       int end=search1(arr, target, false);
       arr[0]=start;
       arr[1]=end;
       return ans;
       
        }
    //this fn just return the index value of tagret
   static int search1(int[] arr,int target,boolean findStartIndex)
    {
        int ans=-1;
int start=0;
int end=arr.length-1;
while(start<=end){
    int mid=(start +end)/2;
    if(target<arr[mid]){
        end=mid-1;
    }else if(target>arr[mid]){
start=mid+1;
    }else{
       ans=mid;//potential answer
       if(findStartIndex==true){
        end=mid-1;
       }else{
        start=mid+1;
       }
    }
}
return ans;
        
}
}

