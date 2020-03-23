package lesson8.Transport;

public class Lorry extends Land {
    int capacity;

    public double powerKB(int power) {
        return (double)power * 0.74D;
    }

    public Lorry(Integer power, Integer max_speed, Double massa, String marka, int count_wheels, float rashod_topliva, int capacity) {
        super(power, max_speed, massa, marka, count_wheels, rashod_topliva);
        this.capacity = capacity;
    }
    public void Capacity(double massa_gruza){
        if(massa_gruza>capacity){
            System.out.println("Нужна машина больше");
        }else{
            System.out.println("Машина загружена");
        }
    }
    @Override
    public String toString() {
        return "Lorry{" +
                "capacity=" + capacity +
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