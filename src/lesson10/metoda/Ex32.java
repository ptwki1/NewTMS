package lesson10.metoda;

import java.util.*;

//Имеется текст. Следует составить для него частотный словарь.
public class Ex32 {
    public static void main(String[] agrs){
        System.out.println("Введите текст");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet())
        {
            System.out.println(word + " " + wordToCount.get(word));
        }


    }
}
