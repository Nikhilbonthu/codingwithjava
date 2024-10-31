public class BinarySearch6 {//position of an elemnet in a sorted array of infinite numbres
    public static void main(String[] args) {//not use length function
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        // System.out.println(search(arr, 8));
        System.out.println(search(arr, 10));

    }
    static int search(int[] arr,int target){
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp=end+1;
            //double the box value
            //end=previous end+size of box*2;
            end=end+(end-start+1)*2;
            start=temp;
        }
return  search1(arr, target, start, end);

    }
    static int search1(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
        }else if(target>arr[mid]){
            start=mid+1;
    }else{
        return mid;

    }

    }
    return -1;
}
}
