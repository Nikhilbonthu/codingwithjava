public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {2,3,6,10,6,4,2,11};
        // System.out.println(peakIndexInMountainArray(arr));
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr){ //example mountain Array int[] arr = [2,4,6,8,6,4,2]
   int i = 0;   //linear search
   while(arr[i] < arr[i+1]){
    i++;
   }
return i;
    }

public static int peakIndexInMountainArray1(int[] arr){ //binary  search
      int ans = searchElement(arr);
return ans;
}
    private static int searchElement(int[] arr){
        int max = arr[0];
        int min = arr[0];
for(int i = 1 ; i<arr.length;i++){
if(arr[i]>max){
    max = arr[i];
}
else 
{

}
}
return max;
    }
}
