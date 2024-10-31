import java.util.*;
public class LinearSearchRecursivemultiple{
    // Linear search on multiple occurence
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        // System.out.println(findAllIndexlast(arr, 4, 0, new ArrayList<>()));
        ArrayList<Integer> ans = findAllIndexlast(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    // return array list
    static ArrayList findAllIndexlast(int[] arr, int target, int index, ArrayList<Integer> list) {
    //    base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexlast(arr, target, index + 1, list);
    }
}
