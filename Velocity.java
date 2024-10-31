public class Velocity {
  public static void main(String[] args) {
    int ans = InitialVelocity(1, 01, 01);
    System.out.println(ans);
  }   
  static int InitialVelocity(int v ,int t ,int a){
    return v - a * t;
  }
}
