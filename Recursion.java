public class Recursion { //numbers program reciursion mean calling itself

    public static void main(String[] args) {
print1(1);
print2(1);
    }
static int print1(int n){
    System.out.println(n);
    return n<5?print1(n+1):0;
}
// static void print2(int n){
//     System.out.println(n);
//     print3(3);

//separarte memory usage for each and every calling instruction 
// memory of computer will exceeds the limits =>stackoverflow error
// }
// static void print3(int n){
//     System.out.println(n);
//     print4(4);
// }
// static void print4(int n){
//     System.out.println(n);
//     print5(5);
// }
// static void print5(int n){
//     System.out.println(n);
    static void  print2(int n){

        if(n==5){
            System.out.println(5);
            return ;
        }else{
            System.out.print(n+" ");
            print2(n+1);
        }
}
}
   
