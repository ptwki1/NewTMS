package lesson8.Human.Trouser;

public class TrouserZara implements  ITrouser{
    public TrouserZara() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеть брюки Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять брюки Zara");

    }
}
