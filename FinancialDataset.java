public class FinancialDataset {
    public static void main(String[] args) {
        int[] arr = {3,5,6,-7,9,10,-12};
        System.out.println(TotalNoOfDays(arr));
    }
    static int TotalNoOfDays(int [] arr){
        int days = 0;
      for (int i = 0; i < arr.length;i++ ) {
 if(arr[i] < 0){
    days++;
 }
      } 
      return days;
     }
}
