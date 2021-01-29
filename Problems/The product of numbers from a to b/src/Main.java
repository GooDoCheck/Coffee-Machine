import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(); // put your code here
        long b = sc.nextInt();
        long sum = a;

        while (a < b - 1) {
            a++;
            sum = sum * a;

        }
        System.out.println(sum);
    }
}