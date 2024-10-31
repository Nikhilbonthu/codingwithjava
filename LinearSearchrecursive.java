public class LinearSearchrecursive {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 9 };
        System.out.println(LinearSearch(arr, 18));
        System.out.println(RecursiveSearch(arr, 1, 0));
        System.out.println(RecursiveSearchindex(arr, 1, 0));
    }
// linear search
    static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // using Recursive function
  static boolean RecursiveSearch(int[] arr, int target,int index){
    // base condition for recursion
 if(index == arr.length - 1){
    return false;
 }
 return (arr[index] == target) || RecursiveSearch(arr, target, index + 1);
  }
  
  static int RecursiveSearchindex(int[] arr, int target, int index) {
      // base condition for recursion
      if (index == arr.length - 1) {
          return -1;
      }
    if((arr[index] == target)){
        return index;
    }else{
return RecursiveSearchindex(arr, target, index + 1);
}  
  }
}
