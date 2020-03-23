package lesson8.Robot.Hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }



    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята вверх");
    }

    @Override
    public int getPrice() {
        return  this.price;
    }
}
