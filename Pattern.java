public class Pattern {
    public static void main(String[] args) {
    
        for(int i = 0; i <5;i++){
            for(int j = 0; j <=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
System.out.println();
        for(int i = 5; i >0;i--){
            for(int j =i; j >0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i <5;i++){
            for(int j = 0; j <=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        pattern1(5);
        System.out.println();
pattern2(5);
System.out.println();
pattern3(5);
System.out.println();
pattern4(5);
System.out.println();
pattern5(5);
System.out.println();
pattern6(5);
System.out.println();
pattern7(5);
System.out.println();
pattern8(5);

    }
    static void pattern1(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j <n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

    }
}
    static void pattern2(int n){
        for(int i = 0; i<=n;i++){
            for(int j = 0; j <=n-i+1 ;j++){
System.out.print("*"+" ");
            }
            System.out.println();
    }
    
}
static void pattern3(int n){
    for(int i = 0; i <n;i++){
        for(int j = 0; j <=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
for(int i = n; i >0;i--){
    for(int j =i; j >0;j--){
        System.out.print("*"+" ");
    }
    System.out.println();
}

}

static void pattern4(int n){
   for(int i = 0; i <n; i++)
   for(int j = 0; j<n-i; j++){
    System.out.print("*"+" ");
   } 
   System.out.println();
}
static void pattern5(int n){
for(int row=0;row<2*n;row++){
    int totalColsInRow=row>n?2*n - row:row;
for(int col=0;col<totalColsInRow;col++){
    System.out.print("* ");
}
System.out.println();
    
}
}
static void pattern6(int n){
    for(int row=0;row<2*n;row++){
        int totalColsInRow=row>n?2*n - row:row;
        int noOfSpaces=n-totalColsInRow;
for(int s=0;s<noOfSpaces;s++){
System.out.print(" ");
}
    for(int col=0;col<totalColsInRow;col++){
        System.out.print("* ");
    }
    System.out.println();
        
    } 

}
static void pattern7(int n){
    for(int row=1;row<=n;row++){
for(int space=0;space<n-row;space++){
    System.out.print(" ");
}
for(int col=row;col>=1;col--){
System.out.print(col+"  ");
}
for(int col=2;col<=row;col++){
System.out.print(col+"  ");
}
System.out.println();
}
} 
static void pattern8(int n){
    for(int row=1;row<=2*n;row++){
        int c=row>n?2*n-row:row;
        for(int space=0;space<n-c;space++){
            System.out.print(" ");
        }
        for(int col=c;col>=1;col--){
        System.out.print(col);
        }
        for(int col=2;col<=c;col++){
        System.out.print(col);
        }
        System.out.println();
        } 
}
static void pattern9(int n){
    for(int row=0;row<2*n-1;row++){
for(int col=0;col<2*n-1;col++){
int atEveryindex=4567;
System.out.println(atEveryindex);

    }
    System.out.println();
}
}
}