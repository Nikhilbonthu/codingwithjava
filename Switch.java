import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
String day=scanner.nextLine();
// switch(day){
//     case "Monday":System.out.println("Day1");
//     break;
//      case "Tuesday":System.out.println("  Day2");
//     break;
//       case "Satuerday":System.out.println("  Day3");
//     break;
// default:System.out.println("Other");
// }
    

 switch(day) 
{
    case "Monday"->System.out.println("Day1");
    case "Tuesday"->System.out.println("Day2");
    case "Wednesday"->System.out.println("Day3");
    case "Thursday"->System.out.println("Day4");
    default -> System.out.println("Other");
}
}
}