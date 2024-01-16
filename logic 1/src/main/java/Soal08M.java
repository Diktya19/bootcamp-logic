import java.util.Arrays;
import java.util.Scanner;

public class Soal08M {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner.nextInt();
        int angka = 2;
        char huruf = 'A';
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(huruf);
                huruf+=2;
            } else {
                array[i] = String.valueOf(angka);
                angka+=2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
