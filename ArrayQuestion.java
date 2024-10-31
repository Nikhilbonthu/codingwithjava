import java.util.*;
public class ArrayQuestion {
    // linear search extension
    // return the list without passing the argument
    public static void main(String[] args) {
int[] arr = {1,2,3,4,4,8};
System.out.println(findAllIndex(arr, 4, 0));
    }
     static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
ArrayList<Integer> list = new ArrayList<>();
if(index == arr.length){
    return list;
}
if(arr[index] == target){
    list.add(index);
}
ArrayList<Integer> ansFromBelowCalls =  findAllIndex(arr, target, index+1);
// all return values stores in the arraylist.
  list.addAll(ansFromBelowCalls);
  return list;
    }
    }
 
