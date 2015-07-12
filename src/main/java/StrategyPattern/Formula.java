package StrategyPattern;

public abstract class Formula implements GeneralRealization {

    public int factorial(int n) {
        int fact = 1;
        for (int c = 1; c <= n; c++)
            fact = fact * c;
        return fact;
    }

    public double avg(int[] a)
    {
        return Double.parseDouble(null);
    }


}
