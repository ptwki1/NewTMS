package lesson3.metoda;//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class Ex9 {
    public static  void main(String[] agrs){
        double composition=1;
        int x=(int)(Math.random()*20);

        while(x!=0){
            composition*=x;
             x=(int)(Math.random()*20);
             System.out.println("value x"+x);
        }
        System.out.println("Output composition x="+composition);

    }
}
