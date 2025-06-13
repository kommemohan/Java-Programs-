package allJavaProblems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String to reverse : ");
        String str =sc.next();
        revStringOne(str);
        revStringTwo(str);
        revStringThree(str);


    }

    private static void revStringThree(String stra) {
        String reva ="";
        for(int i = stra.length()-1; i>=0; i--){
            reva = reva + stra.charAt(i);
        }
        System.out.println(reva);

    }

    private static void revStringTwo(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }

    private static void revStringOne(String a) {
        String rev = "";
        char ch;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }

}
