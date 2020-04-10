package Lesson15.exchanger;

import java.util.Scanner;

public class Buyer  {
    private Double colvoEur;
    private Double  colvoDollars;
    private Double colvoRub;

    public Buyer() {
        this.colvoEur = 1000.0;
        this.colvoDollars = 500.0;
        this.colvoRub=2000.0;
    }

    public void setColvoEur(Double colvoEur) {
        this.colvoEur = colvoEur;
    }

    public void setColvoDollars(Double colvoDollars) {
        this.colvoDollars = colvoDollars;
    }

    public void setColvoRub(Double colvoRub) {
        this.colvoRub = colvoRub;
    }

    public Double  getColvoEur() {
        return colvoEur;
    }

    public Double  getColvoDollars() {
        return colvoDollars;
    }
    public synchronized void toSel(Buyer buyer,Exchanger exchanger){
        System.out.println("Введите что хотите продать 1-(Euro)/2-(Dollars)/0-(Отказаться от этой услуги)");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Введите кол-во денежных едениц для продажи");
        double countMoney=in.nextDouble();
        if(n==1){
            if(countMoney>exchanger.getLIMIT()){
                System.out.println("Вы не можете продать больше лимита!");
            }
            double m=countMoney*exchanger.getCOURSEEURO();
            if(countMoney>getColvoEur()){
                System.out.println("Вы не можете продать денег больше чем у вас есть");
            }else{
                System.out.println("продажа  прошла успешна");
                exchanger.setMaxStackEur(exchanger.getMaxStackEur() +countMoney);
                exchanger.setStartRub(exchanger.getStartRub() - m);
                buyer.setColvoEur(buyer.getColvoEur() - countMoney);
                buyer.setColvoRub(buyer.getColvoRub() + m);
                System.out.println(exchanger.toString());
                System.out.println(buyer.toString());
            }

        }else if(n==2){
            if(countMoney>exchanger.getLIMIT()){
                System.out.println("Вы не можете продать больше лимита!");
            }
            double m=countMoney*exchanger.getCURSEDOLLARS();
            if(countMoney>getColvoEur()){
                System.out.println("Вы не можете продать денег больше чем у вас есть");
            }else{
                System.out.println("продажа  прошла успешна");
                exchanger.setMaxStackDollar(exchanger.getMaxStackDollar() +countMoney);
                exchanger.setStartRub(exchanger.getStartRub() - m);
                buyer.setColvoDollars(buyer.getColvoDollars() - countMoney);
                buyer.setColvoRub(buyer.getColvoRub() + m);
                System.out.println(exchanger.toString());
                System.out.println(buyer.toString());
            }
        }else if(n==0){
            System.out.println("Переходим к другой операции");
        }
    }
    @Override
    public String toString() {
        return "Buyer{" +
                "colvoEur=" + colvoEur +
                ", colvoDollars=" + colvoDollars +
                ", colvoRub=" + colvoRub +
                '}';
    }

    public Double getColvoRub() {
        return colvoRub;
    }
}
