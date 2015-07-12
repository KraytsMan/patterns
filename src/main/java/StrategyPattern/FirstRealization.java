package StrategyPattern;

public class FirstRealization extends Formula {

    public FirstRealization() {
        System.out.println("First realization");
    }

    @Override
    public double avg(int[] a) {
        double avg=0;
        for(int i : a) avg += i;
        return  avg/a.length + 2;
    }
}
