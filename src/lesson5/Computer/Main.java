package lesson5.Computer;



import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {

        Scanner in = new Scanner(System.in);
        Computer comp = new Computer("Intel 1155", "6 GB", "Kingston A400 240GB",4);
        System.out.println(comp);
        comp.turnOn(); //метод включения
        System.out.println("do you want turn on your computer again(1-Yes/0-No)");
        byte x = in.nextByte();
        while (x == 1) {
            if (comp.turnOn() > 0) {
                System.exit(0);
            }
            x = in.nextByte();

        }
        System.out.println("do you want turn off your computer (1-Yes/0-No)");
        byte y = in.nextByte();
        while (x == 1) {
            if (comp.turnOff() > 0) {
                System.exit(0);
            }
            x = in.nextByte();

        }
        if(comp.Resur()>comp.counter){
            System.out.println("He's burnt"); //это метод не очень хорошо  получился в классе computer(),я решил его пеерепиасть здесь
        }
        in.close();
    }

}
