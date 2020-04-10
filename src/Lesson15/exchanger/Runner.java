package Lesson15.exchanger;

import java.util.Scanner;
//Написать клиент для работы обменника.
// Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО.
// Каждый человек так же не может купить или продать долларов или ЕВРО больше, чем какое-то определенное значение.
// В нашей программе, имитирующей торговый центр, работает несколько обменников.
// Одновременно в одном обменнике может находится только один человек.
// Человек может как покупать или продавать валюту так и делать обе эти операции одновременно (покупать доллары и продавать ЕВРО).
public class Runner {

    public static void main(String[] agrs){
        ExchangerShop exchangerShop=new ExchangerShop();
        Thread thread=new Thread(exchangerShop);
        Thread thread2=new Thread(exchangerShop);
        Thread thread3=new Thread(exchangerShop);
       thread.start();
        do {
            try {
                thread.join(250);
            } catch (InterruptedException e) {
            }
        } while (thread.isAlive());
       thread2.start();
        do {
            try {
                thread2.join(250);
            } catch (InterruptedException e) {
            }
        } while (thread2.isAlive());
       thread3.start();
        do {
            try {
                thread3.join(250);
            } catch (InterruptedException e) {
            }
        } while (thread3.isAlive());
    }
}
