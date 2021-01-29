import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int a;
        do {
            a = sc.nextInt();
            num += a;
            if (num >= 1000) {
                num -= 1000;
                break;
            }
        } while (a != 0);
        System.out.println(num);
    }
}