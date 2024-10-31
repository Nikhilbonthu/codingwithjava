import java.util.Scanner;

public class Switch01{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
      //   String fruit=in.nextLine();
      
      //   switch  (fruit) {
      //   case "mango"->System.out.println("king of fruit");
      //   case "apple"->System.out.println("a red fruit");
      //   case"orange"->System.out.println("Round fruit");
      //   case "grapes"->System.out.println("smaller fruit");
      //   default-> System.out.println("please enter valid fruit");
      // }
      int n=in.nextInt();
      switch (n) {
        case 1,2,3,4,5->System.out.println("weekday");
case 6,7->System.out.println("weekend");
      }
        }
    }

