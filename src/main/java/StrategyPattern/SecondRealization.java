package StrategyPattern;

public class SecondRealization extends Formula {

    public SecondRealization() {
        System.out.println("Second realization");
    }

    @Override
    public double avg(int[] a) {
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        return avg / a.length + 3;
    }
}
