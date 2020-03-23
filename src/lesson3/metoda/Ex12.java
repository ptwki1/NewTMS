package lesson3.metoda;

import java.util.Scanner;

//Найдите сумму первых n целых чисел, которые делятся на 3.
public class Ex12 {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n=");
        int n=in.nextInt();
        int sumDivOn3=0;
        for(int i=1;i<=n;i++){
                sumDivOn3+=3*i;
        }
        System.out.println("Sum = "+sumDivOn3);
        in.close();
    }
}
