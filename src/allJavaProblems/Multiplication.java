package allJavaProblems;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        product(number);

    }

    private static void product(int number) {
        for (int i =1 ; i <=10; i++){
            System.out.println(number + " x " + i + "  = " + number*i);
        }
    }
}
