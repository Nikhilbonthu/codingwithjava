public class problem1 {
    //maximum wealth
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},{4,1,6},{3,3,7}
        };
System.out.println(MaxWealth(arr));
    
        
    }
    static int MaxWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        //person =row,acc=column
for(int person=0; person<accounts.length; person++)
{
    int sum=0;
    for(int account=0; account<accounts[person].length; account++){
sum=sum+accounts[person][account];

    }
    if(sum>ans){
        ans=sum;
    }
}
return ans;
    }
    
}
