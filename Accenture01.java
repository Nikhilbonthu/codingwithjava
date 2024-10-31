public class Accenture01 {
    public static void main(String[] args) {
        int[] arr = {10,5,6,3,7,2};
        System.out.println(sumXor(arr));
    }
    static int sumXor(int[] arr){
int sum = 0;
int x =0;
int ans = 0;
for(int i = 0; i < arr.length; i++){
     if(i % 2 ==0){
        x = x ^ arr[i];
     }else{
        sum = sum + arr[i];
     }
 ans = sum - x;
}
return ans;
    }
}
