public class Problem {
    //Finds Numbers with even Number of Digis
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(digits1(3456));

    }   
//     static int findNumbers(int[] nums){
//         int count=0;
//       for(int num:nums){
//         if(even(num)){
//             count++;
//         }
//       }
//       return count;
//     }//funcyion to check  whether a number contains even digits or not
//     private static boolean even(int num){
//         int count1=0;
// while(num>0){
    
// count1++;
// num=num/10;
// }
// if(count1%2==0)
// return true;
// return false;
static int findNumbers(int[] nums){
    int count=0;
    for(int num:nums){
        if(even(num)){
count++;
        }
    }
    return count;
}

//even digits
 static boolean even(int num){
int numberOfDigits=digits(num);
// if(numberOfDigits%2==0){
//     return true;
// }
// return false;
return numberOfDigits%2==0;


}
static int digits1(int num){
return (int)(Math.log10(num))+1;
}
static int digits(int num){
    if(num<0){
        num=num*-1;
    }
    if(num==0){
        return 1;
    }
    int count=0;
    while(num>0){
count++;
num=num/10;

    }
    return count;
}
    }

