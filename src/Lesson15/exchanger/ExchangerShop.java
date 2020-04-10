package Lesson15.exchanger;

public class ExchangerShop implements Runnable {
    @Override
    public void run() {
        Buyer buyer=new Buyer();
        Exchanger exchanger=new Exchanger();
        exchanger.toBuy(buyer,exchanger);
        buyer.toSel(buyer,exchanger);
    }
}
