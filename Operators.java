import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println(" Enter a number : ");
        Scanner readNumber = new Scanner(System.in);
        int firstNumber = readNumber.nextInt();
        System.out.println(" Enter Second Number : ");
        int sencondNumber = readNumber.nextInt();
        int add = firstNumber + sencondNumber;

        System.out.println("Addition : " +add);

        Scanner readNumbe = new Scanner(System.in);
        System.out.print(" Enter a number : ");

        int number = readNumbe.nextInt();

        // check a number divisible by both 2 and 5 ;   logical AND  &&

        if( (number % 2 == 0)  && (number % 5 == 0 ) ){
            System.out.println("Divisible by both 2 and 5");

        }
        else {
            System.out.println("invalid number");
        }








        // check a number divisible by either 2 or 5 ;  logical OR  ||

        if( ( number % 2 == 0 ) || ( number % 5 ==0)) {
            System.out.println(" Divisible by either 2 or 5 ");

        }
        else{
            System.out.println(" Invalid Number");
        }








        // check a number not divisible by 2

        if ( !(number % 2 ==0) ){
            System.out.println(" divisible by 2 ");

        }
        else {
            System.out.println("invalid numbmer ");
        }



        System.out.println(10 & 15); // 10
        System.out.println( 10 | 15); // 15
        
        
        
        }
}
