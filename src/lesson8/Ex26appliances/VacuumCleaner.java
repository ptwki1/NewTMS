package lesson8.Ex26appliances;

public class VacuumCleaner implements  BaseAppliances {
    private int power;

    public VacuumCleaner() {
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void onSocket() {
        System.out.println("turn on you home appliances in socket");
    }

    public void turnOn() {
        System.out.println("turn on you appliances");
    }

    public void turnOff() {
        System.out.println("turn off you appliances");
    }
}

