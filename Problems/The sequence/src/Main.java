import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean trigger = true;
        for (int i = 1; trigger; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                num--;
                if (num == 0) {
                    trigger = false;
                    break;
                }
            }
        }
    }
}