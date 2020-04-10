package Lesson15.library;

import java.util.concurrent.Semaphore;

public class ReadHome implements Runnable {
    private static Semaphore semaphore = new Semaphore(2);
    @Override
    public void run() {
                try {
                    if (!Thread.interrupted())
                        System.out.println("Взял книгу домой");
                    Thread.sleep(2000);
                    semaphore.acquire();
                    System.out.println("Читает книгу дома");
                    Thread.sleep(3000);
                    System.out.println("Прочитал и вернул книгу");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }

