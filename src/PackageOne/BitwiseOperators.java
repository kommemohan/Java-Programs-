public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;   // 0101 in binary
        int b = 3;   // 0011 in binary

        System.out.println("a & b = " + (a & b));  // 0101 & 0011 = 0001 (1)
        System.out.println("a | b = " + (a | b));  // 0101 | 0011 = 0111 (7)
        System.out.println("a ^ b = " + (a ^ b));  // 0101 ^ 0011 = 0110 (6)
        System.out.println("~a = " + (~a));        // ~0101 = 1010 (in 2's comp = -6)

        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 = 1010 (10)
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 = 0010 (2)
    }
}
