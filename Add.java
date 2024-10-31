import java.util.Scanner;
public class Add {
  static int AddNumbers( int num1,int num2 ) {
return num1+num2;
}
static int SimpleInterest(int p,int t,int r){
    return (p*t*r)/100;
}
static void LeapYear(int year){
    if(year%100==0)
    System.out.println("it is a leap year");
    else if(year%4==0 && year%100!=0)
    System.out.println("it is a leap year");
    else
    System.out.println("it is not a leap year");
    // return year;
}
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
// int x=scanner.nextInt();
// int y=scanner.nextInt();
// int ans=AddNumbers(x,y);
// System.out.println(ans);
// int p=scanner.nextInt();;
// int r=scanner.nextInt();
// int t=scanner.nextInt();
// int SI=SimpleInterest(p,t,r);
// System.out.println(SI);
int n=scanner.nextInt();
LeapYear(n);
// System.out.println(ans1);
}
}
