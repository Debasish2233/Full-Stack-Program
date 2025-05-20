import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        scanner.close();

        int terms = (a + 1) / 2; // Determines how many terms to print
        for (int i = 0; i < terms; i++) {
            System.out.print((2 * i + 1));
            if (i < terms - 1) {
                System.out.print(", ");
            }
        }
    }
}
