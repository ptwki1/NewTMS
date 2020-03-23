package lesson8.Robot.Hands;

public class SamsungHand implements  IHand {
   private int price;

    public SamsungHand() {
    }

    public SamsungHand(int price) {
        this.price = price;
    }



    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднята вверх");
    }

    @Override
    public int getPrice() {
        return this.price ;
    }
}
