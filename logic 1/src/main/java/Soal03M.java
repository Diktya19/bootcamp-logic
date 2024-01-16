import java.util.Scanner;

public class Soal03M {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner.nextInt();
        int angka = 0;

        for (int i = 0; i < n; i++) {
                System.out.print(angka+ "\t");
                angka += 2;
            }
        }
    }
