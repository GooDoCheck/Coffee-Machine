import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        kub(a, b, c, d);
        //ax^3+bx^2+cx+d=0
    }
    public static void kub(int a, int b, int c, int d) {
        for (int x = 0; x <= 1000; x++) {
            double result = a * Math.pow(x, 3) + b * x * x + c * x + d;
            if (result == 0) {
                System.out.println(x);
            }
        }
    }
}
