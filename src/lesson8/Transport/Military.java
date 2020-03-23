package lesson8.Transport;

public class Military extends Air {
    int count_racet;
    boolean the_ejection_system;

    public Military(Integer power, Integer max_speed, Double massa, String marka, Double wingspan, Double min_length, int count_racet, boolean the_ejection_system) {
        super(power, max_speed, massa, marka, wingspan, min_length);
        this.count_racet = count_racet;
        this.the_ejection_system = the_ejection_system;
    }



    public double powerKB(int power) {
        return (double)power * 0.74D;
    }
    public void Racet(){
        if(count_racet>0){
            System.out.println("Вестрел");
        }else{
            System.out.println("Ракет нет");
        }
    }
    public void theEjectionSystem(){
        if(the_ejection_system==true){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }
    @Override
    public String toString() {
        return "Military{" +
                "count_racet=" + count_racet +
                ", the_ejection_system=" + the_ejection_system +
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

