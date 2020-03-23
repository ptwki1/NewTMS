package lesson8.Robot.Hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }



    @Override
    public void upHand() {
        System.out.println("Поднфта рука Toshiba вверх");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
