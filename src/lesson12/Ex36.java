package lesson12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.
public class Ex36 {
    public static void main(String[] agrs){
        File file  = new File("D:\\Desktop\\учёба");

        List<String> folderList = new ArrayList<>();
        List<String> fileList = new ArrayList<>();
        if(file.isDirectory()){
            for(File item: file.listFiles()){
                if (item.isDirectory()){
                    folderList.add(item.getName() + "\n");
                } else {
                    fileList.add(item.getName() + "\n");
                }
            }
        }
        System.out.println("Список каталогов:" + "\n" + folderList);
        System.out.println("Список файлов:" + "\n" + fileList);
    }
}
