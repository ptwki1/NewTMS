package lesson10.Ex28;

import java.util.Scanner;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.
public class Ex28 {
    public static <E> void isInput(E mas[]) {
        E a[] = mas;
        TypeForGeneric<E> test = new TypeForGeneric<E>();
        Scanner in = new Scanner(System.in);

        test.setMas(a);


        for(int i = 0; i< test.getLength(); i++) {
            System.out.print(test.getMas(i) + " ");
        }
        System.out.println();
    }



    public static void main(String[] agrs) {
        String[] mas = {"Любые", "типы", "Данных"};
        isInput(mas);
        Double[] mas2 = {1111.223,65.625};
        isInput(mas2);


    }
}