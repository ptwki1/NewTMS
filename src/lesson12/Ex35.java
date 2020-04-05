package lesson12;

import java.io.*;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.
public class Ex35 {
    public static void main(String[] agrs) throws IOException {
        DataOutputStream a = null;

        try {
            a = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream("task35.dat")));
            for(int i=0; i<20;i++) {
                Integer random=(int)(Math.random()*100);
                a.writeInt(random);
            }
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }finally {
            a.close();
        }

        DataInputStream dataInputStream = null;
        try{
            dataInputStream = new DataInputStream(new BufferedInputStream( new
                    FileInputStream("task35.dat")));
            int res = dataInputStream.readInt();
            int sum=0;
            while(true) {
                System.out.println(res);
                sum+=res;
                try {
                    res = dataInputStream.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
            double average=sum/20;
            System.out.println("Сумма ="+sum);
            System.out.println("Среднее арефметическое="+average);

        }
        catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }finally {
            dataInputStream.close();
        }

    }
}
