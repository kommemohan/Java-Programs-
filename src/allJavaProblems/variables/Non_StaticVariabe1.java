package allJavaProblems.variables;

public class Non_StaticVariabe1 {

    // Initializing Non- static Variables
    public int a = 20;
    public int b = 40;

    public static void main(String[] args) {

        // creating a object to access Non-Static Variables
        Non_StaticVariabe1 obj = new Non_StaticVariabe1();

        System.out.println("Addition : " + (obj.a + obj.b));

        System.out.println("Non-Static Variables Accessed within the Same class");
    }
}
