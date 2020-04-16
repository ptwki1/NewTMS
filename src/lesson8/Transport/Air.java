package lesson8.Transport;

public class Air extends Transport {
    Double wingspan;
    Double min_length;

    public Air(Integer power, Integer max_speed, Double massa, String marka, Double wingspan, Double min_length) {
        super(power, max_speed, massa, marka);
        this.wingspan = wingspan;
        this.min_length = min_length;
    }
}
