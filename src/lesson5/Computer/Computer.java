package lesson5.Computer;

import java.util.Scanner;

public class Computer {
    String processor;
    String    ram;
    String hardDrive;
    int   counter;


    public Computer(String processor,String  ram,String hardDrive,int counter){
        this.processor=processor;
        this.ram=ram;
        this.hardDrive=hardDrive;
        this.counter=counter ;
    }

    public int   Crash(){
        int crash=(int)(Math.random()*100);
        return crash;
    }

    Scanner in=new Scanner(System.in);
    int  on=0;          ///я не уверен в этих глобальных переменных(понимаю что ими пользоватся плохо)
    int off=0;
    int resurs=0;



    public int  turnOn(){
        int numberUser;
        int crash;

        if(Crash()>60) {
            crash=(int)(Math.random()*2);
            System.out.println("Please enter number from 0 to 1");
            numberUser = in.nextInt();
            if(crash==numberUser){
                System.out.println("Ok!!Turn OFF!!");
                resurs++;
            }else{
                System.out.println("He's burnt");
                on++;
            }
        }else {
            System.out.println("Start1");
            resurs++;

        }

        return on;
    }

    public int  turnOff(){
        int numberUser;
        int crash;
        boolean work;
        if(Crash()>60) {
            crash=(int)(Math.random()*2);
            System.out.println("Please enter number from 0 to 1");
            numberUser = in.nextInt();
            if(crash==numberUser){
                System.out.println("Ok!!Turn OFF!!");
                resurs++;
            }else{
                System.out.println("He's burnt");
                off++;
            }
        }else {
            System.out.println("End!Good luck!");
            resurs++;
        }

        return off;
    }

    public int Resur(){
        return resurs;
    }

    @Override
    public String toString() {
        return this.processor + ", " +
                this.ram + ", " +
                this.hardDrive+","+
                this.counter;
    }

}
