package Lesson15.exchanger;

import java.util.Scanner;

public class Exchanger {
    private Double  maxStackEur ;
    private Double maxStackDollar;
    private Double startRub;
    private final Double CURSEDOLLARS=2.4;
    private final Double COURSEEURO=2.6;
    private final Double LIMIT=500.0;

    public Double getLIMIT() {
        return LIMIT;
    }

    public Double getStartRub() {
        return startRub;
    }

    public Double getCURSEDOLLARS() {
        return CURSEDOLLARS;
    }

    public void setMaxStackEur(Double maxStackEur) {
        this.maxStackEur = maxStackEur;
    }

    public void setMaxStackDollar(Double maxStackDollar) {
        this.maxStackDollar = maxStackDollar;
    }

    public void setStartRub(Double startRub) {
        this.startRub = startRub;
    }

    public Double getCOURSEEURO() {
        return COURSEEURO;
    }

    public Exchanger() {
        this.maxStackEur = 2000.0;
        this.maxStackDollar = 2500.0;
        this.startRub=3000.0;
    }



    public Double  getMaxStackEur() {
        return maxStackEur;
    }

    public Double getMaxStackDollar() {
        return maxStackDollar;
    }


    @Override
    public String toString() {
        return "Exchanger{" +
                "maxStackEur=" + maxStackEur +
                ", maxStackDollar=" + maxStackDollar +
                ", startRub=" + startRub +
                '}';
    }

    public synchronized void toBuy(Buyer buyer,Exchanger exchanger){
        System.out.println(exchanger.toString());
        System.out.println(buyer.toString());
        Scanner in=new Scanner(System.in);
        System.out.println("Что вы хотите кипить  1-(EURO)/2-(Dollars)/0-(Отказаться от этой услуги)");
        int n=in.nextInt();
        System.out.println("Введите кол-во денежныъ едениц ");
        double buyMoney = in.nextDouble();
        if(n==1){
            if(buyMoney>exchanger.getLIMIT()){
                System.out.println("вы не можете купить больше лимита");
            }else {
                double m = buyMoney * exchanger.getCOURSEEURO();
                if (m > buyer.getColvoRub()) {
                    System.out.println("У вас не хватает денег");
                } else {
                    System.out.println("покупка прошла успешна");
                    exchanger.setMaxStackEur(exchanger.getMaxStackEur() - buyMoney);
                    exchanger.setStartRub(exchanger.getStartRub() + m);
                    buyer.setColvoEur(buyer.getColvoEur() + buyMoney);
                    buyer.setColvoRub(buyer.getColvoRub() - m);
                    System.out.println(exchanger.toString());
                    System.out.println(buyer.toString());
                }
            }
        }else if(n==2) {
            if (buyMoney > exchanger.getLIMIT()) {
                System.out.println("вы не можете купить больше лимита");
            } else {
                double m = buyMoney * exchanger.getCURSEDOLLARS();
                if (m > buyer.getColvoRub()) {
                    System.out.println("У вас не хватает денег");
                } else {
                    System.out.println("покупка прошла успешна");
                    exchanger.setMaxStackDollar(exchanger.getMaxStackDollar() - buyMoney);
                    exchanger.setStartRub(exchanger.getStartRub() + m);
                    buyer.setColvoDollars(buyer.getColvoDollars() + buyMoney);
                    buyer.setColvoRub(buyer.getColvoRub() - m);
                    System.out.println(exchanger.toString());
                    System.out.println(buyer.toString());
                }
            }
        }else if(n==0){
            System.out.println("Переходим к другой операции");
        }
    }
}
