package lesson3.extrahomework;

import java.util.Scanner;

//Вычислить: 1+2+4+8+...+2564)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.
public class Ex3Lesson3 {
    public static void main(String[] agrs) {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {           //Вычислить: 1+2+4+8+...+256
            sum += i;
        }
        System.out.println(" 1+2+4+8+...+256=" + sum);

        System.out.println("enter a and b ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sumAB = 0;

        for (int i = 0; i < a; i++) {
            sumAB += b;
        }


        System.out.println("A*B=" + sumAB);
        in.close();
    }

}
