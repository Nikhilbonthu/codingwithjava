import java.util.*;
public class BitwiseOpeartions01{
    // bitwise opeeartor also the follow associative property
    public static void main(String[] args) {
      int[] arr ={2,3,4,1,2,1,3,6,4};
 
      System.out.println(nonDuplicate(arr));  
      int[] arr1 = {-2,3,2,4,-5,5,-4};
      System.out.println(notNull(arr1));
      
    
    }
static int nonDuplicate(int[] arr){
// Xor all the numbers in the array
int unique = 0 ;
for(int n : arr){
unique^=n;
}
return unique;
}
static int notNull(int[] arr1){
  int element = 0;
  for(int i : arr1){
   element += i;
  }
  return element;
}
}