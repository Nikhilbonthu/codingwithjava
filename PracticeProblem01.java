public class PracticeProblem01{
    public static void main(String[] args) {
     pattern();  
    SpiralMatrix();
    patter1();
    }
    static void pattern(){
        int num=1;
        int next_num=2;
        for(int i=0; i<=4;i++){
            for(int j=0; j<i;j++){
System.out.print(num+" ");
int temp=next_num;
next_num=num+next_num;
num=temp;
            }
            System.out.println();
        }
        System.out.println();
    }
static void SpiralMatrix(){
        int count=1;
        for(int row=0;row<6;row++){
            int col=1;
          while(col<=5){
System.out.print(count+" ");
col++;
count++;
          }
        System.out.println();
    }
}
static void patter1(){
    int count=1;
    for(int i=0;i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}
}