import java.util.Arrays;
import java.util.Scanner;

public class Soal10M {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai n : ");
        int n = scanner.nextInt();
        int p = 3;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            double angka = (double) i + 0;
            double hasil = Math.pow(angka, (double) p);
            array[i] = (int) hasil;
        }
        System.out.println(Arrays.toString(array) + "\t");
    }
}
