public class ClassWork {


    public static void main (String[] args) {

        System.out.println(checkSum( 10, 20));
        integerSum(-1);
        System.out.println(integerСheck(-5 ));
        summText2("Слово", 5);

    }



    public static  boolean  checkSum(int c, int d) {
    int sum = c+d;
        if (sum>=10&& sum<=20 ) {
            return true;
        }
        else {
            return false;
        }

    }


    public static void integerSum (int x) {
        if (x >= 0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательна");
        }

    }


    public static boolean integerСheck(int g) {
        if (g<0) {
            return true;
        }
        else {
            return false;
        }

    }


    public static void summText2(String word, int times) {
        for (int i=0; i < times; i++)
            System.out.println(word);
    }



}
