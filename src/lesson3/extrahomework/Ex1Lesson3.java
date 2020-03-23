
package lesson3.extrahomework;

import java.util.Scanner;

//Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какойсуммарный путь пробежит спортсмен за 7 дней?
public class Ex1Lesson3 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);

        System.out.println("enter starting  distance ");
        double distance=in.nextDouble();

        System.out.println("enter the number of training sessions ");
        int day=in.nextInt();

        double sumDistance=0;
        for(int i=1;i<=day;i++){
             distance=distance+distance*0.1;
             sumDistance=sumDistance+distance;
        }
        System.out.println("all distance = "+sumDistance);
        in.close();
    }
}
