package lesson8.Transport;

public class Runner {
    public static void main(String[] agrs) {
        Automobile test = new Automobile(475, 200, 2.5D, "Жук", 4, 8.0F, "Купэ", 2);
        System.out.println(test.toString());
        test.Output((float) 240.0);
        Military test2=new Military(400,800,3003.54,"Cy-111",4.5,150.0,4,false);
        System.out.println(test2.toString());
        test2.theEjectionSystem();
        test2.Racet();
    }
}
