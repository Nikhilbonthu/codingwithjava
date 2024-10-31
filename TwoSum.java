public class TwoSum {
   public static void main(String[] args) {
    
   } 
   static void twoSum(int[] arr,int target){
    int start = 0;
    int end = arr.length - 1;
    while(start < end){{
int sum = arr[start] + arr[end];
if(sum == target){
return ;
}
else if(target > sum){
    start = start + 1;
}else if(target < sum){
    end =  end + 1;
    }
   }
}
}
}
