public class LucasNumbers {

    // Recursive method to compute Lucas numbers (naive recursion)
    public static long lucas(int n) {
        if(n == 0) return 2;
        if(n == 1) return 1;
        return lucas(n - 1) + lucas(n - 2);
    }

    public static void main(String[] args) {
        // You can get the value of n from command line or hardcode it for testing
        int n = 10; // For example, compute first 10 Lucas numbers
        System.out.println("Lucas numbers up to L(" + n + "):");
        for (int i = 0; i <= n; i++) {
            System.out.print(lucas(i) + " ");
        }
        System.out.println("\n\nFun Fact: Edouard Lucas is also known for inventing the Tower of Hanoi puzzle.");
    }
}
