package lesson8.Robot.Legs;


public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг делает нога Sony");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
