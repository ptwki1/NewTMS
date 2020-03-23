package lesson8.Robot.Legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg() {
    }



    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг делает нога Samsung");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
