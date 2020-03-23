package lesson8.Ex26appliances;

public class TV implements BaseAppliances {
    private int count;
    private int maxvvolue;



    public String toString() {
        return "TV{count=" + this.count + ", maxvvolue=" + this.maxvvolue + "}";
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMaxvvolue() {
        return this.maxvvolue;
    }

    public void setMaxvvolue(int maxvvolue) {
        this.maxvvolue = maxvvolue;
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
