import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        invertArray();
        integerArray();
        numberArray();
        squareArray();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            System.out.print(arr[i]);
        }
    }


    public static void integerArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void numberArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void squareArray() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][10 - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));

        }

    }





}



