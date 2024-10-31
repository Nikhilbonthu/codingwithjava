public class Practiceproblem{
    public static void main(String[] args){
        // int i = 0;
        // for(i=0; i<10;i++){
        //     continue;
        // }
        // // System.out.println(i);
        for(int row=1; row<=5; row++){
            for(int col=1; col<=row; col++){
if((row+col)%2==0){
    System.out.print(1+" ");
}else
{
    System.out.print(0+" ");
}
}
System.out.println();
System.out.println();
}
// pattern(6);
pattern1();
    }
   
static void pattern1(){
for(int i=1; i<=5;i++){
    for(int j=2; j<=5-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print(k+" ");
    }
    System.out.println();
    System.out.println();
}
}
}