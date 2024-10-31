import java.util.Arrays;
public class QuestionAnswer {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        Chocolate(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println("nikhil");

    }
    static void Chocolate(int[] arr){
        int nonZeroIndex = 0;
 for(int i=0; i<arr.length; i++){
    if(arr[i]!=0){
        arr[nonZeroIndex++]=arr[i];
    }
 }
 System.out.println(nonZeroIndex);
 while(nonZeroIndex < arr.length){
    arr[nonZeroIndex++]=0;
 }
        }
        
        

}