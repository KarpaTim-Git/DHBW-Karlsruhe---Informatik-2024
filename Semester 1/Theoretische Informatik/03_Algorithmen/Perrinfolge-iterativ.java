import java.util.Scanner;

public class Iterativ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Berechnung der Perrin-Folge (iterativ) bis: ");
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
            default: {
                int[] perrinValues = new int[n + 1];
                perrinValues[0] = 3; perrinValues[1] = 0; perrinValues[2] = 2;

                for (int i = 3; i <= n; i++) {
                    perrinValues[i] = perrinValues[i - 2] + perrinValues[i - 3];
                }

                return perrinValues[n];
            } 
        }
    }
}
