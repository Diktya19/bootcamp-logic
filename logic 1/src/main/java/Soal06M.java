import java.util.Scanner;

public class Soal06M {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n * 3 - 4; i++) {
            if (apakahPrima(i)){
                System.out.print(i + "\t");
            }
        }

        scanner.close();
    }

    private static boolean apakahPrima(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
