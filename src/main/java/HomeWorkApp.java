public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }

    public static void checkSumSign() {
        int a = 4;
        int b = 5;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");

        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int valve = 19;

        if (valve <= 0) {
            System.out.println("Красный");
        }
        if (valve > 0 && valve <= 100) {
            System.out.println("Желтый");
        }

        if (valve > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
