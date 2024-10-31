import java.util.Scanner;

public class NestedCase{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//         int empId=in.nextInt();
//         String department=in.next();
// System.out.println(empId);
// System.out.println(department);
int n = 10;

for(int i = 0;i < n ;i++){
    if(i%2!=0){
        continue;
    }
    System.out.println(i);
}

    }
} 