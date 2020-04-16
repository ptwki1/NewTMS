package lesson8.Human.Jacket;

public class BossJacket implements IJacket {
    public BossJacket() {
    }

    @Override
    public  void putOn() {
        System.out.println("Надета кофта Boss");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять кофту Boss");
    }
}
