package lesson3.metoda;

import java.util.Scanner;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
public class Ex17 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lenght, its size of array ");
        int lenght = in.nextInt();


        int arr[][];

        arr = new int[lenght][lenght];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = 1;
                }

            }

        }
        for (int i = arr.length - 1; i >= arr.length / 2 ; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < lenght; i++) {
            System.out.println();
            for (int j = 0; j < lenght; j++) {
                System.out.print(arr[i][j] + "\t");
            }

        }
        in.close();

    }
}
