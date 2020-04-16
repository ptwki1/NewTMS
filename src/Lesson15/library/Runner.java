package Lesson15.library;


import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
//)Написать клиент для работы библиотеки.
// В библиотеке доступны к чтению несколько книг.
// Некоторые из них можно выдавать на руки некоторые - только в читальный зал.
// Посетители могут брать одновременно по несколько книг на руки и в читальный зал.
public class Runner { public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
    ArrayList<Book> books = DocumentPars.bookDocument();
            Random random = new Random();
            new Thread(() -> {
                try {
                    int count=3;
                    while(count>0) {
                        System.out.println("Взять книгу");
                        int i = random.nextInt(books.size());
                        Book emp = (Book) books.toArray()[i];
                        System.out.println(String.format("Книга : имя - %s, жанр - %s,год - %s, обложка книги - %s.", emp.getName(), emp.getGenre(), emp.getYear(), emp.getCover()));
                        Thread.sleep(1000);
                        if (i > 5) {
                            ReadingRoom readingRoom = new ReadingRoom();
                            Thread readR = new Thread(readingRoom);
                            System.out.println("Эту книгу можно взять только в читальный зал");
                            readR.start();
                            do {

                                try {
                                    readR.join(250);                //Подождать окончания мысли четверть секунды.
                                } catch (InterruptedException e) {
                                }
                            }
                            while (readR.isAlive());
                        } else {
                            ReadHome readHome = new ReadHome();
                            Thread readH = new Thread(readHome);
                            System.out.println("Вы можете взять не более 2 книг с собой ");
                            readH.start();
                            do {
                                try {
                                    readH.join(250);
                                } catch (InterruptedException e) {
                                }
                            } while (readH.isAlive());
                        }
                        count--;
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
            System.out.println("******");
        }
}

