package behavioural.observer;

public class IncomeHandler implements Observer {

    Subject stockData = null;

    public IncomeHandler(Subject stockData) {
        this.stockData = stockData;
        stockData.addObserver(this);
    }

    public void update(String stockSymbol, Double stockValue, Integer stockUnits) {
        System.out.println("IncomeHandler received changes... ");
    }
}
