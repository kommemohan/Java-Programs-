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
        }
}

output :

Enter a number : 
5
 Enter Second Number : 
10
Addition : 15
