package lesson8.Human;
import  lesson8.Human.Jacket.BossJacket;
import lesson8.Human.Shoes.AirShoes;
import lesson8.Human.Trouser.TrouserBoss;
public class Human1 implements IHuman{
    private String name;
    private BossJacket jacket;
    private TrouserBoss trouser;
    private AirShoes shoes;

    public Human1(String name, BossJacket jacket, TrouserBoss trouser, AirShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trouser = trouser;
        this.shoes = shoes;
    }

    public Human1() {
    }



    @Override
    public void putOnAll() {
        jacket.putOn();
        trouser.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOffAll() {
        jacket.takeOff();
        trouser.takeOff();
        shoes.takeOff();
    }
}
