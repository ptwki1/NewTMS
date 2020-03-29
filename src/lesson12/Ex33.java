package lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.
public class Ex33 {
    public static void main(String[] agrs) throws IOException {
        FileReader fileInputStream = new FileReader("task33.txt");
        BufferedReader bufFile=new BufferedReader(fileInputStream);
        String line=bufFile.readLine();
        while(line!=null){
            System.out.println(line);
            String newLine = line.replaceAll("[a-zA-Z]", " ");
            int pm = newLine.trim().split("\\s+").length;
            System.out.println("Количество знаков припинания="+pm);

            line = line.replaceAll("[^a-zA-Z]", " ");
            int words = line.trim().split("\\s+").length;
            System.out.println("Количество слов = " + words);
            line=bufFile.readLine();
        }
        fileInputStream.close();
    }
}

