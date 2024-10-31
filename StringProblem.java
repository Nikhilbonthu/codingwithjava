public class StringProblem {
    public static void main(String[] args) {
        String str="NIKHIL";
        System.err.println(toLowerCase(str));

    }
static String toLowerCase(String str) {
    // in  array format length is used but string length() is used in the peration
char[]  c = str.toCharArray();
for(int i=0;i<c.length;i++)
{
    if(c[i]>=65 && c[i]<= 90){
     c[i]=(char)(c[i]+32);
    }

}
return String.valueOf(c);

}

}
