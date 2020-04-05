package lesson12.dopTaskHomework.task4;

import java.io.Serializable;

public class Auto implements Serializable {
    private  String marka;
    private  Double speed;
    private  Double price;

    public Auto(String marka, Double speed, Double price) {
        this.marka = marka;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
