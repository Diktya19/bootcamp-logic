import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        char[] array = DeretAngka.huruf(n);

        PrintArray.printArray(array);
    }
}