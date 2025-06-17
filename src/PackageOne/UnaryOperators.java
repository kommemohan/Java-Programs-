public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
      

        System.out.println("+a  = " + (+a));   // +a = 5
        System.out.println("-a  = " + (-a));   // -a = -5

        System.out.println("a++ = " + (a++));  // a++ = 5 (then a becomes 6)
        System.out.println("++a = " + (++a));  // ++a = 7 (a becomes 7)

        System.out.println("a-- = " + (a--));  // a-- = 7 (then a becomes 6)
        System.out.println("--a = " + (--a));  // --a = 5 (a becomes 5)

        
        System.out.println("~a  = " + (~a));   // ~5 = -6 (bitwise complement)
    }
}
