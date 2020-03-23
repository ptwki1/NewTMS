package lesson8.Human;
import lesson8.Human.Jacket.ZaraJacket;
import lesson8.Human.Trouser.TrouserZara;
import lesson8.Human.Shoes.LandShoes;
public class Human2 implements IHuman {
    private String name;
    private ZaraJacket jacket;
    private TrouserZara trouser;
    private LandShoes shoes;

    public Human2(String name, ZaraJacket jacket, TrouserZara trouser, LandShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trouser = trouser;
        this.shoes = shoes;
    }

    public Human2() {
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
