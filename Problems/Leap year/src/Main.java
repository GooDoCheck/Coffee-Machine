import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();

        if (year >= 1900 && year <= 3000) {
            if (year % 4 == 0 && year % 100 != 0 ^ year % 400 == 0) {

                System.out.println("Leap");
            } else if (year % 4 != 0 && year % 100 == 0 ^ year % 400 != 0) {

                System.out.println("Regular");
            } else {
                System.out.println("Regular");
            }
        }
    }
}
