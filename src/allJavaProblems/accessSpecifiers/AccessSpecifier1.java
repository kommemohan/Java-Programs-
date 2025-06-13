package allJavaProblems.accessSpecifiers;

public class AccessSpecifier1 {

    public static void main(String[] args) {

        //creating object for accessing Non-Static Variable

        AccessSpecifier obj1 = new AccessSpecifier();

        // c variable is accessed within the class only

        // e variable is accessed within the method only

        System.out.println(AccessSpecifier.a + obj1.b + obj1.d);

    }
}
