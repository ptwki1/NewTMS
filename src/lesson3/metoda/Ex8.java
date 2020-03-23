package lesson3.metoda;

import java.util.Random;
import java.util.Scanner;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
public class Ex8 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println(" число");
        Random rand=new Random();
        int money=in.nextInt();
        ;
        int x = money % 100;
        int y = money % 10;

        if ((x == 1 || y == 1) && x!=11)
            System.out.println(money + " рубль");
        if ((5 > x && x > 1 || y > 1 && y < 5) && x!=12 && x!=13&& x!=14 )
            System.out.println(money + " рубля");
        if (20 > x && x > 10 || y > 5 && y < 10  )
            System.out.println(money + " рублей");

        in.close();
    }
}
