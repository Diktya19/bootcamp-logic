import java.util.Scanner;

public class Soal04M {
    public static void main(String[] args) {
        int n, a = 1, b = 1, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a + "\t");

            c = a + b;
            a = b;
            b = c;
        }
    }
}
