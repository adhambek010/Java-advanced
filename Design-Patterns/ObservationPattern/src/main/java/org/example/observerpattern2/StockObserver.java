package org.example.observerpattern2;

import lombok.Getter;

@Getter
public class StockObserver implements Observer{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    private static int observerIdTracker = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printThePrices();
    }
    void printThePrices(){
        System.out.printf(" Observer id : %s\nIBM price %s\nApple price %s\nGoogle price %s\n",
                observerId,ibmPrice,applePrice,googlePrice);
        //11:21
    }
}
