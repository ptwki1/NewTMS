package lesson8.Robot;
import lesson8.Robot.Hands.SamsungHand;
import lesson8.Robot.Heads.SamsungHead;
import lesson8.Robot.Legs.SonyLeg;

import lesson8.Robot.Hands.SonyHand;
import lesson8.Robot.Heads.ToshibaHead;
import lesson8.Robot.Legs.SamsungLeg;

import lesson8.Robot.Hands.ToshibaHand;
import lesson8.Robot.Heads.SonyHead;

import java.lang.reflect.Array;


public class Run  {
    public static int  Max(int n, int[] mas){
        int max=mas[0];
        for(int i=1;i<mas.length;i++){
            if(mas[i]>max){
                max=mas[i];
            }
        }
        return  max;
    }
    public static void main(String[] main){
        System.out.println("****************************************");
        SamsungHead head=new SamsungHead(123);// стоймость головы samsung
        SamsungHand hand=new SamsungHand(231);// стоймость руки samsung
        SonyLeg leg=new SonyLeg(111);// стоимость ноги sony
        Robot robot1=new Robot(head,hand,leg);
        robot1.action();
        System.out.println(robot1.getPriceAll());

        System.out.println("****************************************");

        ToshibaHead head2=new ToshibaHead(555);
        SonyHand hand2=new SonyHand(777);
        SamsungLeg leg2=new SamsungLeg(111);
        Robot2 robot2=new Robot2(hand2,head2,leg2);
        robot2.action();
        System.out.println(robot2.getPriceAll());

        System.out.println("****************************************");

        SonyHead head3=new SonyHead(666);
        ToshibaHand hand3=new ToshibaHand(888);
        SonyLeg leg3=new SonyLeg(111);
        Robot3 robot3=new Robot3(hand3,head3,leg3);
        robot3.action();
        System.out.println(robot3.getPriceAll());

        System.out.println("****************************************");

        int []mas={robot3.getPriceAll(),robot2.getPriceAll(),robot1.getPriceAll()};
        System.out.println("Самый дорогой робот будет стоить "+Max(3,mas));

    }
}
