import java.util.Arrays;
import java.util.Scanner;

public class Soal07M {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner.nextInt();
        char huruf = 'A';
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(huruf);
            huruf++;
        }
        System.out.print(Arrays.toString(array) + "\t");
    }
}
