package lesson8.Robot.Legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг делает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
