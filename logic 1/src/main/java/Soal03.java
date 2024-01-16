import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] array = DeretAngka.Genap(n);

        PrintArray.printArray(array);
    }
}