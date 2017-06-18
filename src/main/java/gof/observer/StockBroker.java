package gof.observer;

public class StockBroker {

    public static void main(String[] args) {
        // Initialize Subject
        StockData stockData = new StockData();
        Observer incomeHandler = new IncomeHandler(stockData);

        // Put it to work
        stockData.setStockData("ABCD", 489.50, 10000);
        stockData.setStockData("EFGH", 231.25, 1000000);
        stockData.setStockData("IJKL", 9.63, 2500000);
    }

}
