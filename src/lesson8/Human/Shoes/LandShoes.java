package lesson8.Human.Shoes;

public class LandShoes implements IShoes {
    public LandShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеть обувь Land");
    }

    @Override
    public void takeOff() {
        System.out.println("Снфть обувь Land");
    }
}
