package lesson5.medota;
import java.util.Scanner;

//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class Ex19 {
    public String isEnter(){
        System.out.println("введите строку");
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        return str;
    }
    public int isCount(){
        int counter = 0;
        char prev = ' ';
        String str=isEnter();
        for(int i=str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            if(c != prev && prev == ' ') {
                counter++;
            }
            prev = c;
        }
        return counter;
    }
    public static void main(String[] agrs) {
        Ex19 stroka=new Ex19();
        System.out.println(stroka.isCount());

    }
}