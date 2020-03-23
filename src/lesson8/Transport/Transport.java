package lesson8.Transport;

public abstract  class Transport {
    Integer power;
    Integer max_speed;
    Double massa;
    String marka;

    public Transport(Integer power, Integer max_speed, Double massa, String marka) {
        this.power = power;
        this.max_speed = max_speed;
        this.massa = massa;
        this.marka = marka;
    }
}
