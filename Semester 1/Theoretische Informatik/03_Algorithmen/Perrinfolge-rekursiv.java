import java.util.Scanner;

public class Rekursiv {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berechnung der Perrin-Folge (rekursiv) bis: ");
        int n = scanner.nextInt();

        System.out.println("Die " + n + "-te Zahl der Perrin-Folge ist: " + Perrin(n));
        scanner.close();
    }

    private static int Perrin(int n) {
        switch (n) {
            case 0:
                return 3;
            case 1:
                return 0;
            case 2:
                return 2;
            default:
                return Perrin(n - 2) + Perrin(n - 3);
        }
    }
}
