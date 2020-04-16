package Lesson15.library;


import java.util.concurrent.Semaphore;

public class ReadingRoom implements Runnable {
    private static Semaphore semaphore = new Semaphore(1);
    @Override
    public void run() {
            try {
                System.out.println("Пошел в читальный зал");
                semaphore.acquire();
                System.out.println("Читает");
                Thread.sleep(3000);
                System.out.println("Прочитал и вернул книгу");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

