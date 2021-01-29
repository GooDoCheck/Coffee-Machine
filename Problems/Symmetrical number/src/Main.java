import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String year = new Scanner(System.in).nextLine(); // put your code here
        if (year.charAt(0) == year.charAt(3) && year.charAt(1) == year.charAt(2)) {
            System.out.println("1");
        } else {
            System.out.println((int) (Math.random() * 100 + 2));
        }
    }
}