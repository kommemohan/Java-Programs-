package allJavaProblems.accessSpecifiers;

public class AccessSpecifier {

    public static int a = 1;
    protected int b = 2;
    private static int c =3;
    int d = 4;                          // default

    public static void main(String[] args){

        int e = 5;

        // Creating Object for accessing Non-Static Variables

        AccessSpecifier obj = new AccessSpecifier();

        System.out.println(a + obj.b + c + obj.d + e);

    }
}
