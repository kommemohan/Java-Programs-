package allJavaProblems.variables;

public class FirstLocal {


    public static  int mohanage = 23 ;  // static Variable

    public int sonyage = 28;        // Non- static Variable


    public static void main(String[] args) {


//        int sonyage = 26;

        // creating an object here

        FirstLocal object = new FirstLocal();


        double mymarks = 9.01d;// Local Variable

        //it is accessed within the method only

        System.out.println("Sony Age is : "  + object.sonyage);

        System.out.println("Mohan Age is : "  + mohanage );



    }

















}
