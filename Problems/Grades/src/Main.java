import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sumA = 0; // put your code here
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;
        for (int a = 0; a < sum; a++) {
            int rating = sc.nextInt();
            if (rating == 5) {
                sumA++;
            } else if (rating == 4) {
                sumB++;
            } else if (rating == 3) {
                sumC++;
            } else if (rating == 2) {
                sumD++;
            }
        }
        System.out.println(sumD + " " + sumC + " " + sumB + " " + sumA);
    }
}