package lesson3.extrahomework;

import java.util.Scanner;

//Одноклееточная амеба кажды 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
public class Ex2Lesson3 {
    public static void main(String[] agrs){

        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество часов  наблюдений за амебой  ");
        int hour=in.nextInt();
        int counter=1;
        for(int i=3;i<=hour;i+=3){
            counter*=2;
            System.out.println("Анем на за промежуток времени ="+i+" n="+counter);
        }
       in.close();
    }

}
