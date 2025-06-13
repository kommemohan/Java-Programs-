package allJavaProblems;

import java.util.Scanner;



import PackageOne.NonStatic1;

public class Logical {
    public static void main(String[] args) {
//
        Scanner readNumber = new Scanner(System.in);
        System.out.print(" Enter a number : ");

        int number = readNumber.nextInt();

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






    NonStatic1 object = new NonStatic1();


        System.out.println("Sony Age is : " + object.sonyage);













    }
}
