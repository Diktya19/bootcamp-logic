import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.print(n + "\t");
        }
    }
}
