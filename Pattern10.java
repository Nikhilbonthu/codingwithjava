public class Pattern10 {
   
    public static void main(String[] args) {
        pattern();
        pattern1();
        reversepattern1();
        // love();
    }

    static void pattern(){
        int rows=5;
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=rows-i;j++){
System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    System.out.println();
    }
    static void pattern1(){
        for(int i=1;i<=5;i++){
           for(int j=1;j<i;j++){
       System.out.print(" ");
    }
    for(int k=i;k<=5;k++){
        System.out.print(k+" ");
    }
    System.out.println();
}
}
static void reversepattern1(){
    int rows=5;
    for(int i=0;i<=rows;i++){
        for(int j=0;j<=rows-i;j++){
System.out.print(" ");
    }
    int count=5;
    for(int k=1;k<=i;k++){
        System.out.print(count+" ");
        count--;
    }
    System.out.println();
}
System.out.println();
}
static void love(){
    for(int i=1;i<=3;i++){
        for(int j=1;j<=15;j++){
            if((j>=4-i && j<=4+i)|| (j>=12-i && j<=12+i)){
System.out.println("*");

            }else{
                System.out.print(" ");
            }
for(int n=8;n>=1;n++){
    for(int k=1;k<=8-i;k++){
        System.out.print(" ");
}
for(int w=1;w<=2*i-1;w++){
System.out.println("*");
}
           
        }
    }
}

}
}
