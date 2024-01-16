import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = DeretAngka.fibo(n , 2);

        PrintArray.printArray(array);
    }
}
