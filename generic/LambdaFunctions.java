package generic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    // lambda function are single line function

    public static void main(String[] args) { 
        // int[] arr = {3,4,52,1};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i < 5; i++) {
        arr.add(i+1);
        }
        // consumer type: that accepts a single input argument and returns no result
        // item represent the every single element in the array
        // arr.forEach((item) -> {
        //     System.out.println(item * 2);
        // });
        //  OR
        Consumer<Integer> consumer = (item) -> System.out.println(item * 2);
        arr.forEach(consumer);

        Operation sum = (a,b) -> a + b;
        Operation prod = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;
        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println("value:"+myCalculator.operate(5, 3, sub));

    }
  int sum(int a,int b){
    return a + b;
  }
private int operate(int a,int b,Operation op){
    return op.operation(a,b);
}
}
// for multiple input arguments
interface Operation{
    int operation(int a,int b);
}
