package lesson8.Human.Jacket;

public class ZaraJacket implements IJacket {
    public ZaraJacket() {
    }
    @Override
    public void putOn() {
        System.out.println("Надеть кофту Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кофту Zara");
    }
}
