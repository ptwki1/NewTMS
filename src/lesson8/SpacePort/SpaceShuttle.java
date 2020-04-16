package lesson8.SpacePort;

public class SpaceShuttle extends SpacePort implements ISpace {
    @Override
    public boolean preLaunchSystemCheck() {
        int random=(int)(Math.random()*10);
        if(random>3){
            return true;
        }
        return false;
    }

    @Override
    public void isStart() {
        System.out.println("Старт Шатла");
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }
}
