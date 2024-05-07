import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        reverseArray(readIntegers());
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
//        int[] arrayTest = new int[size];
//        boolean isTrue = true;
//        while(isTrue) {
//            try {
//                System.out.println("Enter " + size + " Integers for the array");
//                isTrue = false;
//                for(int i = 0; i < arrayTest.length; i++) {
//                    arrayTest[i] = scanner.nextInt();
//                }
//            } catch(InputMismatchException ime) {
//                System.out.println("Enter valid input");
//                isTrue = true;
//            }
//        }

        String input = scanner.nextLine();
        String[] strings = input.split(",");
        int[] arrayTest = new int[strings.length];

        for(int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = Integer.parseInt(strings[i].trim());
        }

        System.out.println(Arrays.toString(arrayTest));
        return arrayTest;
    }

    public static int findMin(int[] array) {
//        boolean isTrue = true;
//
//        while(isTrue) {
//            isTrue = false;
//
//            for(int i = 0; i < (array.length - 1); i++) {
//                if(array[i] < array[i + 1]) {
//                    int temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    isTrue = true;
//                }
//            }
//        }


        int min = Integer.MAX_VALUE;
        for(int i : array) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    private static void reverseArray(int[] array) {

        int[] reverseArray = Arrays.copyOf(array, array.length);
        int x = reverseArray.length - 1;

//        for(int i = 0; i < (reverseArray.length / 2); i++) {
//            int x = reverseArray[i];
////            System.out.println(x);
//            reverseArray[i] = reverseArray[reverseArray.length - (i + 1)];
////            System.out.println(reverseArray[i]);
//            reverseArray[reverseArray.length - (i + 1)] = x;
////            System.out.println(reverseArray[reverseArray.length - (i + 1)]);
//        }

        for(int i : array) {
            reverseArray[x--] = i;
        }

        System.out.println(Arrays.toString(reverseArray));
    }
}
