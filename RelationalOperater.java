package allJavaProblems;

public class RelationalOperators {
    public static void main(String []args) {

        int a = 10;
        int b = 50;
        System.out.println(a < b);  // true
        System.out.println(a > b);    //false
        System.out.println(a <= b); //true
        System.out.println(a >=b );    // false
        System.out.println(a ==b );      //false
        System.out.println(a !=b );   //true

        add(10,50); // call by value




    }

    private static void add(int a, int b) {
        int sum = a+b; // sum = 60
        System.out.println(sum);
        
    }
}




