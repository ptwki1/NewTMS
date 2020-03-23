package lesson8.Human;
import lesson8.Human.Jacket.BossJacket;
import lesson8.Human.Shoes.AirShoes;
import lesson8.Human.Trouser.TrouserBoss;

import lesson8.Human.Jacket.ZaraJacket;
import lesson8.Human.Trouser.TrouserZara;
import lesson8.Human.Shoes.LandShoes;

public class RunHuman {
    public static void main(String[] agsr){
         BossJacket jacket=new BossJacket();
         AirShoes shoes=new AirShoes();
         TrouserBoss trouser=new TrouserBoss();
        Human1 test1=new Human1("Никадим",jacket,trouser,shoes);
        test1.putOnAll();
        System.out.println("***************************");
        test1.takeOffAll();
        ZaraJacket jacket2=new ZaraJacket();
        TrouserZara trouser2=new TrouserZara();
        LandShoes shoes2=new LandShoes();
        Human2 test2=new Human2("Никадим2",jacket2,trouser2,shoes2);
        test2.putOnAll();
        System.out.println("***********");
        test2.takeOffAll();
    }

}
