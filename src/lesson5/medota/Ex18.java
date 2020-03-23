package lesson5.medota;

//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество.

import java.util.Scanner;
import java.lang.String;

public class Ex18 {
    public String isEnter(){
        System.out.println("введите строку");
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        return str;
    }
    public int isCount(){
        int n=0;

        String str =isEnter();
        char symbol;
        for(int i = 0;i < str.length(); i++){
            symbol = str.charAt(i);
            if(symbol == ',' || symbol == '.' || symbol == '-'|| symbol==':'|| symbol=='"'|| symbol=='!'||symbol=='?' || symbol==';') {
                n++;
            }
        }
        return n;
    }
    public static void main(String[] agrs){
        Ex18 stroka=new Ex18();
        System.out.println(stroka.isCount());

    }


}