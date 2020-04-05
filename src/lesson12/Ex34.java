package lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.
public class Ex34 {
    public static void main(String[] agrs) throws IOException {
        List<Integer> integers = new ArrayList<>();
        Integer sum=0;
        FileReader file = new FileReader("task34.txt");
        BufferedReader bufFile=new BufferedReader(file);
        String line=bufFile.readLine();
        while(line!=null){
            System.out.println(line);
            Pattern pattern = Pattern.compile("\\d+\\S?\\d*");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()) {
                String s = matcher.group(0);
                if (s.replaceAll("\\D", "").length() == s.length()) {
                    integers.add(Integer.parseInt(s));
                }
            }
            System.out.println("Числа взяты из строки");
            System.out.println(integers);
            line=bufFile.readLine();
        }
        Iterator<Integer> iterator=integers.iterator();
        while(iterator.hasNext()){
            sum+=iterator.next();
        }
        System.out.println("сумма всех чисел ="+sum);
        Set<Integer> set = new LinkedHashSet<Integer>(integers);
        System.out.println("Все числа после удаления повторяющихся");
        System.out.println(set);
        file.close();
    }
}
