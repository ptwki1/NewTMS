package lesson3.metoda;//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите числа  а и б ");
        int a=in.nextInt();
        int b=in.nextInt();

        System.out.println("Введите радиус окружности которой надо будет закрыть прямоугольный отверстие");
        int r=in.nextInt();
        if((a*a+b*b)/4<=r*r){
            System.out.println("круг сможет зактрыть отверстие");
        }else {
            System.out.println("круг не может быть отверстие ");
        }
        in.close();

    }
}
