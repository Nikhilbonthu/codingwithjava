// square of a sorted array
import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        int [] nums ={-4,-1,0,3,10}; 
       System.out.println(Arrays.toString(sortedSquare(nums)));
    }
    public static int[] sortedSquare(int[] nums){
//         for(int i=0;i<nums.length;i++){
//           nums[i]=  nums[i]*nums[i];
//         }
//         Arrays.sort(nums);//time complexity of nlog(n);
// return nums;
int left = 0, right = nums.length-1;
int result[] = new int[nums.length];
int i = nums.length - 1;
while(left<=right){
    if(Math.abs(nums[left])>Math.abs(nums[right])){
result[i] = nums[left] * nums[left];
left++;
    }else{
        result[i] = nums[right]*nums[right];
        right--;
    }
    i--;
}
 return result;
    }

}
