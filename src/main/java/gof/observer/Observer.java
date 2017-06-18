package gof.observer;

public interface Observer {

    void update(String stockSymbol, Double stockValue, Integer stockUnits);

}
