import java.util.Arrays;

public class Bubblesorting {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,4,5};
    sorting(arr);

        System.out.println(Arrays.toString(arr));
    }
  static void sorting(int[] arr){
    boolean swapped;
    for(int i=0; i<arr.length; i++){//run the steps n-1 times
        swapped=false;
        for(int j=1; j<arr.length-i; j++){//for each step max item will come at the last respective index
if(arr[j]<arr[j-1]){
    int temp=arr[j];
    arr[j] = arr[j-1];
    arr[j-1] = temp;
    swapped = true;
}
    }
    if(!swapped){
        break;
    }

  }
}
}
