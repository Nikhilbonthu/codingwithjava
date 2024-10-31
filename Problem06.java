import java.util.*;
public class Problem06 {
    public static void main(String[] args) {
int [] nums = {3,4,5,1,2};
System.out.println(findMin(nums));
    }
static  int findMin(int[] nums){
     int low = 0;
     int high = nums.length - 1;
     while(low<high){
       int  mid = low + (high - low)/2;
       if(nums[mid] < nums[high]){
low = mid+1;
       }else{
        high = mid;
       }
     }
     return nums[high];

    }
}
