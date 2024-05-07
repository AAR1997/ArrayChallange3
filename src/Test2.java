import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(findMin(readElements(readInteger())));
    }

    static Scanner s = new Scanner(System.in);

    private static int readInteger() {

        System.out.println("Enter an Integer");
        return s.nextInt();
    }

    private static int[] readElements(int x) {

        System.out.println("Enter " + x + " Integers for the array");
        int[] array = new int[x];

        for(int i = 0; i < x; i++) {
            array[i] = s.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}
