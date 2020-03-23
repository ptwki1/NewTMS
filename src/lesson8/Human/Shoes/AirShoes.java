package lesson8.Human.Shoes;

public class AirShoes implements IShoes{
    public AirShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеть обувь Air");
    }

    @Override
    public void takeOff() {
        System.out.println("Снфть обувь Air");
    }
}
