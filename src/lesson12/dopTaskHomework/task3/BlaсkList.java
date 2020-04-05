package lesson12.dopTaskHomework.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BlaсkList {
    public static void checkBlaсkList(String str,String line){
        String[] arrString=str.trim().split("\\s+");
        String[] arrLine=line.trim().split("\\s+");
        int count=0;
        for(int i=0;i<arrString.length;i++){
            for(int j=0;j<arrLine.length;j++){
                if(arrString[i].equals(arrLine[j])){
                    System.out.println("!"+line+"!");
                    System.out.println("Это строчка требует исправления");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Это строка прошла проверку  на цензуру ");
        }else{
            System.out.println("Это строка не прошла не прошла проверку на цензуру");
        }
    }

    public static void main(String[] agrs) throws IOException {
        FileReader file = new FileReader("task3.txt");
        FileReader blackList = new FileReader("BlackList.txt");

        BufferedReader bufferedReader = new BufferedReader(file);
        String line = bufferedReader.readLine();
        BufferedReader bufReader = new BufferedReader(blackList);
        String blList = bufReader.readLine();
        while(line!=null){
            checkBlaсkList(blList,line);
            line = bufferedReader.readLine();
        }
        blackList.close();
        file.close();
    }
}
