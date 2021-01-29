import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt(); // put your code here

        if (scanner.nextBoolean()){
            System.out.println(cups >= 15 && cups <= 25);
        }
        else {
            System.out.println(cups >= 10 && cups <= 20);
        }
    }
}