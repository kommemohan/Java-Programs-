package allJavaProblems;

import java.util.Scanner;

public class CheckevenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isEven = checking(number);
        if (isEven){
            System.out.println("Even");
        }
        else System.out.println("Odd");



    }

    public static boolean checking(int number) {
        boolean isEven = false;
        if (number % 2 ==0 ){
            isEven = true;
        }
        return isEven;
    }
}
