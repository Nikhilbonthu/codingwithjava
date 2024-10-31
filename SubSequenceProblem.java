public class SubSequenceProblem {
    public static void main(String[] args) {
        int[] values = {5,5,3,3,3,1};
        System.out.println(RepeatedValue(values));
    }
    static int RepeatedValue(int[] values) {
    int Max_count = 0;
    int Most_freq = 0;
    for (int i = 0; i < values.length; i++) {
        int count = 0;
        for (int j = 0; j < values.length;j++){
            if(values[i ] == values[j]){
                count++;
            }
        }
        if(count > Max_count){
            Max_count = count;
            Most_freq = values[i];
        }
    }
    return Most_freq;
}
}
