package allJavaProblems.variables;

public class LocalVariable {


    public static void main(String[] args) {
        a1();
    }

    private static void a1() {

        //initializing Local Variables
        int a=10; int b=20;

        // Access Static Varial from another class
        System.out.println("Addition : " + (a+b));
        System.out.println("Local Variables are  Accessed within the method and the same Class ");
    }

}
