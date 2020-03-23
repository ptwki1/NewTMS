package lesson8.Ex26appliances;

public class Runner {
    public static void main(String[] agrs) {
        TV test = new TV();
        Sony test2 = new Sony();
        modelA test3 = new modelA();
        modelB test4 = new modelB();
        System.out.println("********");
        test.onSocket();
        test.setCount(100);
        test.getCount();
        System.out.println(test.toString());
        System.out.println("********");
        test2.onSocket();
        test2.setCount(200);
        test2.getCount();
        System.out.println(test2.toString());
        System.out.println("********");
        test3.onSocket();
        test3.setCount(300);
        test3.getCount();
        test3.turnOnHdmi();
        test3.turnUpVolume();
        System.out.println(test3.toString());
        System.out.println("********");
        test4.setPower(800);
        test.onSocket();
        test4.goHome();
    }
}
