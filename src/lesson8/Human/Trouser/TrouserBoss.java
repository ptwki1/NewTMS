package lesson8.Human.Trouser;

public class TrouserBoss implements ITrouser {
    public TrouserBoss() {
    }

    @Override
    public void putOn() {
        System.out.println("Надеть брюки Boss");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять  брюки Boss");
    }
}
