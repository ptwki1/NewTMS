package lesson12.dopTaskHomework.task4;

import java.io.*;

public class Runner {
    public static void main(String[] agsr){
        Auto auto=new Auto("Audi",220.0,20000.0);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream("Serializable.txt");
            out = new ObjectOutputStream(fos);
            out.writeObject(auto);
            out.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Auto ato = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream("Serializable.txt");
            in = new ObjectInputStream(fis);
            auto = (Auto)in.readObject();
            in.close();
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
