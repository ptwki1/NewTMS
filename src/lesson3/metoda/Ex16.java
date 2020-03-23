package lesson3.metoda;

import java.util.Scanner;

//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.
public class Ex16 {
    public static void main(String[] agrs) {


        Scanner in = new Scanner(System.in);
        System.out.println("enter number for border random  n=");
        int n=in.nextInt();

        System.out.println("enter range of number ");
        int range=in.nextInt();

        int length=(int)(Math.random()*n)+1;
        System.out.println ("size array ="+length);

        int array[];
        array=new int [length];

        for(int i=0;i<length;i++){
             array[i]=(int)(Math.random()*range);
        }

        for (int min = 0; min <length - 1; min++) {
            int last = min;
            for (int j = min + 1; j <length; j++) {
                if (array[j] < array[last]) {
                    last = j;
                }
            }
            int tmp = array[min];
            array[min] = array[last];
            array[last] = tmp;

        }

        for(int i=0;i<length;i++){
            System.out.print(" "+array[i]+" ");
        }
        System.out.println("");
        int sum=0;
        for(int i=1;i<length-1;i++){
            sum+=array[i];
        }
        System.out.println("Sum without min and max elements = "+sum  );
        in.close();
    }
}
