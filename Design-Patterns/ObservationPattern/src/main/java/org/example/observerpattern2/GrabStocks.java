package org.example.observerpattern2;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        Observer observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(660.77);
        stockGrabber.setGooglePrice(676.87);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(644.60);
        stockGrabber.setGooglePrice(675.80);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(197);
        stockGrabber.setApplePrice(650.20);
        stockGrabber.setGooglePrice(635.40);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getApple = new GetTheStock(stockGrabber, 2, "Apple", 650.20);
        Runnable getGoogle = new GetTheStock(stockGrabber, 2, "Google", 635.40);
        new Thread(getIBM);
        new Thread(getApple);
        new Thread(getGoogle);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            
    }
}
