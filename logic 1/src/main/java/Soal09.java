import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = DeretAngka.kaliTiga(n, 3);

        PrintArray.printArray(array);
    }
}
