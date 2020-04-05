package lesson12.dopTaskHomework.task2;

import java.io.*;

public class TextFormater {

    //Метод принимает строку и возвращает кол-во слов в строке.
    public static int countWorld(String string ){
        int words = string.trim().split("\\s+").length;
        System.out.println("Количество слов = " + words);
        return words;
    }


//Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
    public static boolean isPalindromesWorld(String string){
        int j=0;
        String[] arrString=string.trim().split("\\s+");
        for(int i=0;i<arrString.length;i++) {
         StringBuffer rev = new StringBuffer(arrString[i]).reverse();
        String strRev = rev.toString();
        if(arrString[i].equals(strRev)) {
            j++;
            }
        }
        if(j==0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] agrs) throws IOException {
        FileReader file;
        try {
            file = new FileReader("fileWithTask2.txt");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        BufferedReader bufFile=new BufferedReader(file);
        String line=bufFile.readLine();

        // создадим новый файл для записи
        FileWriter a;
        try {
            a = new FileWriter("testForTask2.txt");
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        while(line!=null){
            int n=countWorld(line);
            if(isPalindromesWorld(line)){
                a.write(line+"\n");
            }else if(n>=3 && n<=5){
                a.write(line+"\n");
            }
            line=bufFile.readLine();
        }

        a.close();
    }
}
