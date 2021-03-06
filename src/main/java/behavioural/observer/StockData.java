package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockData implements Subject {

    private String stockSymbol = null;
    private Double stockValue = null;
    private Integer stockUnits = null;
    private List<Observer> observers = null;

    public StockData() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer o: observers) {
            o.update(stockSymbol, stockValue, stockUnits);
        }
    }

    public void setStockData(String stockSymbol, Double stockValue, Integer stockUnits) {
        // In real-time, this method might be invoked with values from a live web service at regular intervals.
        this.stockSymbol = stockSymbol;
        this.stockValue = stockValue;
        this.stockUnits = stockUnits;
        setDataChanged();
    }

    private void setDataChanged() {
        notifyObservers();
    }
}
