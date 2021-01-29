import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // put your code here
        int num = 0;
        int a;
        do {
            a = sc.nextInt();
            if (a > 0) {
                num++;
            }

        } while (a != 0);
        System.out.println(num);
    }
}