import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();

        if (validate(n)) {
            show(n);
        }
    }

    private static boolean validate(int n) {
        if (n <= 0) {
            System.out.println("неверное количество");

            return false;
        }

        return true;
    }

    private static void show(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}