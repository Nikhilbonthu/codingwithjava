public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(evenOdd(arr));
    }
    static String evenOdd(int[] arr){
       String result="" ;
       for(int i : arr){
        if(i % 2 == 0){
            result+="even   " ;
        }
        else{
            result+="odd   " ;
        }
       }
       return result;
    }
}
