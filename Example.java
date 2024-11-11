import java.util.Scanner;

public class Example{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int sumDoWhile = 0;
        int indexDoWhile = 0;
        do {
            sumDoWhile += array[indexDoWhile];
            indexDoWhile++;
        } while (indexDoWhile < length);

        int sumWhile = 0;
        int indexWhile = 0;
        while (indexWhile < length) {
            sumWhile += array[indexWhile];
            indexWhile++;
        }

        int min = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("do-while: " + sumDoWhile);
        System.out.println("while: " + sumWhile);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}