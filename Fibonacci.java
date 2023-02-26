public class Fibonacci {

    public static int recursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursive(n-1) + recursive(n-2);
    }

    public static int dynamic(int n) {
        int[] index = new int[n+1];
        index[0] = 0;
        index[1] = 1;
        for (int i = 2; i <= n; i++) {
            index[i] = index[i-1] + index[i-2];
        }
        return index[n];
    }

    public static void main(String[] args) {
        int n =  40;

        long startTimeRecursive = System.nanoTime();
        int resultRecursive = recursive(n);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        long startTimeDynamic = System.nanoTime();
        int resultDynamic = dynamic(n);
        long endTimeDynamic = System.nanoTime();
        long durationDynamic = endTimeDynamic - startTimeDynamic;

        System.out.println("Fibonacci Recursive Result: " + resultRecursive);
        System.out.println("Recursive Time:" + durationRecursive + " nanoseconds\n");

        System.out.println("Fibonacci Dynamic Result: " + resultDynamic);
        System.out.println("Dynamic Time: " + durationDynamic + " nanoseconds");
    }


}
