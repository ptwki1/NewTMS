package lesson5.medota;

import java.util.Scanner;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
public class Ex20 {

    public String isEnter() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }

    public void isLast() {
        System.out.println("enter string");
        String str = isEnter();
        String z = "";
        String strcopy=str.concat(" ");
        System.out.println(strcopy);
        for (int i = 0; i < strcopy.length()-1; i++) {
            char c = strcopy.charAt(i + 1);
            if (strcopy.charAt(i) != ' ' && c == ' ') {
                System.out.print(""+strcopy.charAt(i));
            }

        }
    }
    public static void main (String[]agrs){
        Ex20 stroka = new Ex20();  // тут я конечно не удачно выбрал имя
        stroka.isLast();
    }

}