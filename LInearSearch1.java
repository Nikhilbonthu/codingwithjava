import java.util.*;
class LInearSearch1{
    public static void main(String[] args)
    {
int[] arr={18,12,-7,3,14,28};
System.out.println(mininum(arr));
// System.out.println(range(arr,1,0,4));
    }
//     static int range(int[] arr,int target, int start, int end){
//         if(arr.length ==0){
//             return -1;
//         }
//         for(int index=start; index<=end; index++){
// if(arr[index]==target)
// {
//     return index;
// }    }
// return -1;
// }
static  int mininum(int[] arr){
    if(arr.length==0){
        return -1;
    }
    int min=arr[0];
    for(int i=1; i<arr.length; i++){
if(arr[i]<min){
    min=arr[i];
}
}
return min;
}
}