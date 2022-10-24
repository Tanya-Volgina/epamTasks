import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double a = in.nextDouble();

        System.out.print("Введите ширину: ");
        double b = in.nextDouble();

        if (validate(a, b)) {
            calculate(a, b);
        }
    }

    private static boolean validate(double a, double b) {
        if (a <= 0) {
            System.out.println("Длина равна или меньше 0");

            return false;
        } else if (b <= 0) {
            System.out.println("Ширина равна или меньше 0");

            return false;
        }
            return true;

    }

    private static void calculate(double a, double b) {
        System.out.println("площадь равна " + a * b);
    }
}