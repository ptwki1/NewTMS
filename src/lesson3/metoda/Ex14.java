package lesson3.metoda;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.
public class Ex14 {
    public static void main(String[] agrs){
        int length=(int)(Math.random()*12)+1; //выбираем произвольную длинну массива
        System.out.println("length of array ="+length);

        int array[];
        array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=(int)(Math.random()*10);
            System.out.println (" "+array[i]+" ");
        }
        int  max=array[0];
        int  min=array[0];
        int maxIndex=0;
        int minIndex=0;
        for(int i=0;i<length;i++){
            if(array[i]>max){
                max=array[i];
                maxIndex=i+1;
            }
            if(array[i]<min){
                min=array[i];
                minIndex=i+1;
            }
        }

        System.out.println(" min number= "+min);
        System.out.println("min index number= "+minIndex);
        System.out.println(" max number= "+max);
        System.out.println(" max index number= "+maxIndex);

    }
}
