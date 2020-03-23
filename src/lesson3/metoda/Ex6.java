package lesson3.metoda;// Методичка задание 6

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число");
        double  number=in.nextDouble(); // вводим число

        int c=(int ) number%10; // присваеваем с последнюю цифру

        int counter=0;

        while (number > 1) {
            number/=10;
            counter++;
        }
        if(counter==3){ //проверка на трехзначность
            System.out.println("число техзначное");
        }else {
            System.out.println("число не является трехзначным");
        }
        if(number%2==0) { // проверка на четность
            System.out.println("Число четное");
        }else{
            System.out.println("число нечетное");
        }

        if(c==7){ // проверка последнего числа с 7
            System.out.println("последнее число =7");
        }else{
            System.out.println("последнее число !=7");
        }
        in.close();
    }

}
