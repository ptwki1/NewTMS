package lesson8.Transport;

public class Land extends Transport {
    int count_wheels;
    float rashod_topliva;

    public Land(Integer power, Integer max_speed, Double massa, String marka, int count_wheels, float rashod_topliva) {
        super(power, max_speed, massa, marka);
        this.count_wheels = count_wheels;
        this.rashod_topliva = rashod_topliva;
    }
}
