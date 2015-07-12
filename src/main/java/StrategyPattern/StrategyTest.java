package StrategyPattern;

public class StrategyTest {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        Formula formula1 = new FirstRealization();
        System.out.println("first class factorial = " + formula1.factorial(4));
        System.out.println("first class avg = " + formula1.avg(a));
        Formula formula2 = new SecondRealization();
        System.out.println("first class factorial = " + formula2.factorial(4));
        System.out.println("first class avg = " + formula2.avg(a));

    }
}
