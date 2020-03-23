package lesson3.metoda;//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Ex10 {
    public static void main(String[]  agrs){
        System.out.println("Посчитать факториал числа в границах от 10 до 15");
        int  composition=1;
        for(int i=10;i<16;i++){
            System.out.println("i="+i);
            composition*=i;
            System.out.println(composition);
        }
        System.out.println ("Composition="+composition);
    }

}
