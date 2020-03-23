package lesson3.metoda;

import java.util.Scanner;

//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.
public class Ex13 {
    public static void main(String[] main){
        Scanner in=new Scanner(System.in );
        System.out.print("enter length n= ");
        int n=in.nextInt();
        int array[];
        array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=(int) (Math.random()*100);
        }
        int max=array[0];
        for(int i=0;i<n;i++){
            System.out.print  (" "+array[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max number ="+max);
        in.close();
    }

}
