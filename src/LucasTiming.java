public class LucasTiming {

    // Naive recursive Lucas function
    public static long lucas(int n) {
        if(n == 0) return 2;
        if(n == 1) return 1;
        return lucas(n - 1) + lucas(n - 2);
    }

    // Custom sequence: change these to, say, your birthday numbers
    public static long customSeq(int n, int n0, int n1) {
        if(n == 0) return n0;
        if(n == 1) return n1;
        return customSeq(n - 1, n0, n1) + customSeq(n - 2, n0, n1);
    }

    public static void main(String[] args) {
        int maxN = 40; // You can go higher if your computer can handle it. Be warned: Your PC might become the next generation mini oven if the number is set too high
        long[] times = new long[maxN+1];
        long[] values = new long[maxN+1];

        System.out.println("n \t Lucas(n) \t Time (ns) \t Ratio(L(n+1)/L(n)) \t Ratio(Time(n+1)/Time(n))");
        for (int n = 0; n <= maxN; n++) {
            long start = System.nanoTime();
            values[n] = lucas(n);
            long end = System.nanoTime();
            times[n] = end - start;

            System.out.print(n + "\t" + values[n] + "\t\t" + times[n]);
            if(n > 0) {
                double ratioValue = (double) values[n] / values[n-1];
                double ratioTime = (n > 1 ? (double) times[n] / times[n-1] : 0);
                System.out.print("\t\t" + String.format("%.3f", ratioValue));
                if(n > 1)
                    System.out.print("\t\t\t" + String.format("%.3f", ratioTime));
            }
            System.out.println();
        }

        System.out.println("\nOrder of growth: The recursive Lucas algorithm is exponential, " +
                "roughly O(phi^n), where phi is about 1.618.");

        // Bonus: Custom Sequence
        int n0 = 11, n1 = 3; // For instance, using birthday numbers or any numbers you like
        System.out.println("\nCustom sequence N(n) with N(0)=" + n0 + " and N(1)=" + n1 + ":");
        for (int n = 0; n <= 20; n++) {  // limit to 20 terms for brevity and to not turn my PC into a nuclear reactor
            System.out.println("N(" + n + ") = " + customSeq(n, n0, n1));
        }
        // don't worry about this line being too long, it's the explanation
        System.out.println("The ratios of each successive term for the custom sequence will converge to the dominant root of its characteristic equation, " +
                "indicating exponential growth as well.");
    }
}
