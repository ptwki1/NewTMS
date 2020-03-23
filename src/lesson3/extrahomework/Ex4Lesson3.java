package lesson3.extrahomework;

import java.util.Scanner;

//Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от
// 1 до 20 дюймов. 1 дюйм = 2,54 см
public class Ex4Lesson3 {
    public static void main(String[] agrs){
        int n=20;
        double  santimetr=0;
        for(int i=1;i<=n;i++){
            santimetr=i*2.54;
            System.out.println("кол-во сантиметров "+santimetr+ " i= "+i);
        }
    }
}
