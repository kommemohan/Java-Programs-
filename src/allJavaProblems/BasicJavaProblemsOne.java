package allJavaProblems;
import java.util.Scanner;

public class BasicJavaProblemsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("           1. Check Even or Odd ");
        System.out.println("===========================================");
        System.out.print("Enter a number: ");
        int numb = sc.nextInt();
        checkEvenorOdd(numb);

        System.out.println("===========================================");
        System.out.println("       2. Positive, Negative or Zero");
        System.out.println("===========================================");
        System.out.print("Enter a number: ");
        int numbe = sc.nextInt();
        checkPositiveorNegitiveorZero(numbe);

        System.out.println("===========================================");
        System.out.println("       3. Find the Largest of 3 numbers ");
        System.out.println("===========================================");
        System.out.print("Enter first number: ");
        int num = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();
        checklLargestNumber(num,num2,num3);

        System.out.println("===========================================");
        System.out.println("         4. Grading System  ");
        System.out.println("===========================================");
        System.out.print("Enter Student marks (0-100) : ");
        int marks = sc.nextInt();
        gradingSystem(marks);

        System.out.println("===========================================");
        System.out.println("          5.Vowel or Consonant  ");
        System.out.println("===========================================");
        System.out.println("Enter a Alphabet (a-z) : ");
        char alphabet = sc.next().toLowerCase().charAt(0);
        vowelOrConsonant(alphabet);

        System.out.println("===========================================");
        System.out.println("          6. simple Calculater");
        System.out.println("===========================================");
        System.out.print("Enter First number : ");
        int input1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int input2 = sc.nextInt();
        System.out.print("Enter operator ( + , - , * , / ) : ");
        char operation = sc.next().toLowerCase().charAt(0);
        simpleCalculater(input1,input2,operation);

          System.out.println("===========================================");
          System.out.println("           7. Check Leap Year");
          System.out.println("===========================================");
          System.out.print("Enter a year to check leap year or not : ");
          int leapyear = sc.nextInt();
          checkLeapYear(leapyear);

            System.out.println("===========================================");
        System.out.println("      8. Number  is divisible by both 5 and 11");
        System.out.println("===========================================");
        System.out.println("Enter a number : ");
        int checknum = sc.nextInt();
        divibleby(checknum);


    }

    private static void divibleby(int a) {
        if( a%5==0 && a%11==0){
            System.out.println(a + " is divisible by both 5 and 11");
        }
        else System.out.println(a + " is Not divisible by 5 and 11");
    }

    private static void checkLeapYear(int leapyear) {
        boolean isLeapYear = false;
        if (leapyear%4 == 0 && leapyear%100 !=0 || leapyear%400==0){
            isLeapYear = true;
        }else System.out.println("Not a Leap Year");
        if (isLeapYear) System.out.println(leapyear + " is a Leap Year");
    }

    private static void vowelOrConsonant(char alphabet) {
        boolean isAlphabet = false;
        if(alphabet >= 'a' && alphabet <='z'){
            isAlphabet = true;
        }
        else System.out.println("Error : you entered another character ");
        if (isAlphabet){
            if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u' ){
                System.out.println(alphabet + " is a Vowel");
            }
            else System.out.println(alphabet + " is a Consonant");
        }
    }

    private static void simpleCalculater(int firstNum, int secondNum, char op) {
        switch (op){
            case '+':{
                System.out.println("Addition : " + (firstNum+secondNum));
                break;
            } case '-':{
                System.out.println("Subtraction1 : " + (firstNum-secondNum));
                break;
            } case '*':{
                System.out.println("Multiplication : " + (firstNum*secondNum));
                break;
            } case '/':{
                if (secondNum!=0) System.out.println("Division : " + (firstNum/secondNum));
                else System.out.println("Error : cannot divided by zero");
                break;
            }
            default:
                System.out.println("Invalid option");
        }
    }

    private static void gradingSystem(int marks) {
        boolean marksValid = false;
        if (marks>=0 && marks<=100){
            marksValid = true;
        }
        else System.out.println("Invalid Marks ");
        if(marksValid){
            if(marks>=90 && marks<=100){
                System.out.println("Grade : A");
            } else if (marks>=80 && marks>=89) {
                System.out.println("Grade : B");
            } else if (marks>=70 && marks>=79) {
                System.out.println("Grade : C");
            }else System.out.println("Fail");
        }
    }

    private static void checklLargestNumber(int num, int num2, int num3) {
        boolean isAllSameNumbers = false ;
        boolean isTwoNumSame = false;
        if (num==num2 && num2==num3) isAllSameNumbers = true;
        if (num==num2 || num2==num3 || num==num3) {
            isTwoNumSame = true;
        }
        if (isAllSameNumbers){
            System.out.println("All numbers are Same");
        } else if (isTwoNumSame) {
            if (num<num3){
                System.out.println(num3 + " is Largest Number");
            } else if (num<num2) {
                System.out.println(num2 + " is Largest Number");
            } else if (num>num2) {
                System.out.println(num + " is Largest Number");
            } else {
                System.out.println("Two numbers are same");
            }


        } else {
            if(num>num2 && num>num3){
                System.out.println(num + " is Largest Number");
            } else if (num2>num3) {
                System.out.println(num2 + " is Largest Number");

            }
            else System.out.println(num3 + " is Largest Number");
        }


    }

    private static void checkEvenorOdd(int numb) {

        boolean isEven =false;

        if (numb%2 == 0){
            isEven = true;
        }
        else {
            System.out.println("Odd Number");
        }
        if (isEven){
            System.out.println("Even Number");
        }

    }

    private static void checkPositiveorNegitiveorZero(int numbe) {
        boolean isPositive = false;
        boolean isneagtive = false;
        if (numbe>0){
            isPositive = true;
        } else if (numbe<0) {
            isneagtive = true;
        }
        else {
            System.out.println(numbe + " is Zero");
        }
        if (isPositive){
            System.out.println(numbe + " is Positive Number.");
        }
        if(isneagtive)
            System.out.println(numbe + " is Negative Number.");
    }


}
