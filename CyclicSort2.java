import java.util.Arrays;
import java.util.*;//variable length
//find the missing nmber

public class CyclicSort2 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        
        System.out.println((findDisappearedNumbres(arr)));
    }
public static List<Integer> findDisappearedNumbres(int[] arr){
int i=0;
   while(i<arr.length){
    int index =arr[i]-1;
        if(arr[i]!=arr[index]){
            swap( arr,i,index);
        }else{
            i++;
        }
    }
//just find missing number
List<Integer> ans = new ArrayList<>();
for(int index=0;index<arr.length;index++){
if(arr[index]!=index+1){
    ans.add(index+1);

}
}
return ans;


}
static void swap(int[] arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;
    }

}
