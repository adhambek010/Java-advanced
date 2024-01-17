package org.example.observerpattern2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DecimalFormat;

@Getter
@Setter
@NoArgsConstructor
public class GetTheStock implements Runnable{

    private int startTime;
    private String stock;
    private double price;
    private StockGrabber stockGrabber;

    public GetTheStock(StockGrabber stockGrabber, int startTime, String stock, double price){
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }
    @Override
    public void run() {
        for(int i = 0; i < 20; i++){
            try {
                Thread.sleep(startTime* 1000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            double randNum = (Math.random() * (0.6)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.parseDouble(df.format(price + randNum));

            if (stock.equals("IBM")){
                stockGrabber.setIbmPrice(price);
            } else if (stock.equals("Apple")) {
                stockGrabber.setApplePrice(price);
            } else {
                stockGrabber.setGooglePrice(price);
            }

            System.out.printf("%s : %s %s\n",stock, df.format(price+randNum), df.format(randNum));

        }
    }
}
