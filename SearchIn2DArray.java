import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] arr=new int[][]{
            {23,4,1},
            {18,12,3,9},{78,99,34,56},
            {18,12}
            };
            int target=56;
            System.out.println(Arrays.toString(search(arr,target)));
            System.out.println(max(arr));
        }
        static int[] search(int[][] arr, int target){
            for(int rows=0;rows<arr.length;rows++){
                for(int cols=0;cols<arr[rows].length;cols++){
if(arr[rows][cols]==target){
return new int[]{rows,cols};
                }
        }
    }
    return new int[]{-1,-1};
}
static int max(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int[] ints:arr){
for(int elements:ints){ 
if(elements>max){
    max=elements;
}
}
    }
   return max; 
}
}

