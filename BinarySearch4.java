public class BinarySearch4 {
    public static void main(String[] args) {
    char[] arr={'c','f','j'};
    System.out.println(search(arr, 'e'));
    }
    static char search(char[] arr,char ch ){
        int start=0;
        int  end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
if(ch<arr[mid]){
end=mid-1;
        }else{
            start=mid+1;
        }

    }
    // return arr[start%arr.length];
     return start<arr.length?arr[start]:arr[end];
}
}