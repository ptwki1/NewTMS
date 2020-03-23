package lesson8.Transport;


public class Automobile extends Land {
    String body_tip;
    int count_passengers;

    public Automobile(Integer power, Integer max_speed, Double massa, String marka, int count_wheels, float rashod_topliva, String body_tip, int count_passengers) {
        super(power, max_speed, massa, marka, count_wheels, rashod_topliva);
        this.body_tip = body_tip;
        this.count_passengers = count_passengers;
    }

    public double powerKB(int power) {
        return (double)power * 0.74D;
    }

    private float Rashod(float time) {
        return time * this.rashod_topliva;
    }

    public void Output(float time) {
        System.out.println("За время " + time + "(ч) автомобиль " + this.marka + "двигаясь с максимальной скоростью " + this.max_speed + "(км/ч) проедет " + time * (float)this.max_speed + " (км)  и израсходует " + this.Rashod(time) + " литров топлива. ");
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "body_tip='" + body_tip + '\'' +
                ", count_passengers=" + count_passengers +
                ", count_wheels=" + count_wheels +
                ", rashod_topliva=" + rashod_topliva +
                ", power=" + power +
                ", max_speed=" + max_speed +
                ", massa=" + massa +
                ", marka='" + marka + '\'' +
                ", powerKB"+ powerKB(power)+
                '}';
    }
}
