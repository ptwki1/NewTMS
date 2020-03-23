package lesson3.metoda;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.
public class Ex11 {
    public static void main (String[] agrs){
        Scanner in=new Scanner(System.in);
        System.out.println ("Enter number");
        int  number=in.nextInt();
        boolean isComposite =  true;
        int tmp;
        for(int i=2;i*i<=number;i++){
            tmp=number%i;
            if(tmp==0){
                isComposite = false;
                break;
            }
        }
        if(isComposite){
            System.out.println("the number is simple");
        }else
            {
            System.out.println("the number is not simple");
        }
        in.close();
    }
}
