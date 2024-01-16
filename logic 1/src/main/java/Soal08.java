import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        String[] array = DeretAngka.hurufDanAngka(n);

        PrintArray.printArray(array);

    }
}
