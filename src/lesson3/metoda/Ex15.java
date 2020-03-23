package lesson3.metoda;

import java.util.Scanner;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).
public class Ex15 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number for border random  n=");
        int n = in.nextInt();

        System.out.println("enter range of number ");
        int range = in.nextInt();

        int length = (int) (Math.random() * n) + 1;
        System.out.println("size array ="+length);

        int array[];
        array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * range);
        }

        for(int i=0;i<length;i++){
            System.out.print(" "+array[i]+" ");

        }
        int tmp;
        int i=0,j=length-1;
        while(i!=j){
            tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
            i++;
            j--;
        }


        for( i=0;i<length;i++){
            System.out.print(" "+array[i]+" ");

        }
        in.close();
    }
}
