import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // put your code here
        long num = sc.nextLong();

        System.out.println(getFactorial(num));
        // put your code here
    }
    public static long getFactorial(long f) {
        long result = 1;
        int a = 1;
        for (int i = 1; result <= f; i++) {
            result = result * i;
            a = i;
        }

        return a;
    }
}