package allJavaProblems.variables;

public class Non_StaticVariable2 {

    public static void main(String[] args) {

        //creating a object to access Non-Static Varibles in different class
        Non_StaticVariabe1 obj2 = new Non_StaticVariabe1();

        System.out.println("Subtraction : " + (obj2.a - obj2.b));
        System.out.println("Non-Static Varible is Accessed ");
    }

}
