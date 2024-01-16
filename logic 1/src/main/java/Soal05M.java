import java.util.Scanner;

public class Soal05M {
    public static void main(String[] args) {
        int n, value1 = 1, value2 = 1, value3 = 1, value4;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(value1 + "\t");

            value4 = value1 + value2 + value3;
            value1 = value2;
            value2 = value3;
            value3 = value4;
        }
    }
}
