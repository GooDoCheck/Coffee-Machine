import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // put your code here
        String shape = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;
        double yardage;
        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double semiPerimeter = (a + b + c) / 2;
                yardage = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
                System.out.println(yardage);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                yardage = a * b;
                System.out.println(yardage);
                break;
            case "circle":
                r = scanner.nextDouble();
                yardage = 3.14 * Math.pow(r, 2);
                System.out.println(yardage);
                break;
            default:
                break;
        }
    }
}