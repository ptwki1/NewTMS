package lesson12.dopTaskHomework.task1;



import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.String.valueOf;

public class Task1 {
    public static void main(String[] agrs) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        FileReader fis = new FileReader("task1.txt");
        BufferedReader bufferedReader = new BufferedReader(fis);
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            list.add(line);
            line = bufferedReader.readLine();
        }
        fis.close();
        System.out.println(list);
        FileWriter a;
        try {
            a = new FileWriter("taskWithPolindrom.txt");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String variable=iterator.next();
            StringBuffer rev = new StringBuffer(variable).reverse();
            String strRev = rev.toString();
            if(variable.equals(strRev)){
                a.write(variable+" ");
            }
        }
        a.close();
    }
}