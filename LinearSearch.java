import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
int [] nums={23,45,1,2,3,4,5,6,7,8,9};
int target=scanner.nextInt();
int ans=linearsearch(nums, target);
System.out.println(ans);
    }
    static int linearsearch(int []arr,int target)
{
    if(arr.length==0){
        return -1;
    }
for(int i=0;i<arr.length;i++){
    int element=arr[i];
    if(element==target){
        return element;
    
    }
}
return -1;
}
}

