package lesson8.Transport;

public class Public extends Air {
    int count_passengers;
    boolean business_class;

    public Public(Integer power, Integer max_speed, Double massa, String marka, Double wingspan, Double min_length, int count_passengers, boolean business_class) {
        super(power, max_speed, massa, marka, wingspan, min_length);
        this.count_passengers = count_passengers;
        this.business_class = business_class;
    }

    public double powerKB(int power) {
        return (double)power * 0.74D;
    }
    public void ColvoMest(int  count ){
        if(count>count_passengers){
            System.out.println("Нужен  самолет  больше");
        }else{
            System.out.println("Самолет может лететь");
        }
    }
    @Override
    public String toString() {
        return "Public{" +
                "count_passengers=" + count_passengers +
                ", business_class=" + business_class +
                ", wingspan=" + wingspan +
                ", min_length=" + min_length +
                ", power=" + power +
                ", max_speed=" + max_speed +
                ", massa=" + massa +
                ", marka='" + marka + '\'' +
                ", powerKB"+ powerKB(power)+
                '}';
    }
}
