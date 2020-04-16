package lesson8.Robot;
import lesson8.Robot.Hands.SonyHand;
import lesson8.Robot.Heads.ToshibaHead;
import lesson8.Robot.Legs.SamsungLeg;

public class Robot2 implements IRobot{
    private SonyHand hand;
    private ToshibaHead head;
    private SamsungLeg leg;

    public Robot2(SonyHand hand, ToshibaHead head, SamsungLeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Robot2() {
    }

    public SonyHand getHand() {
        return hand;
    }

    public void setHand(SonyHand hand) {
        this.hand = hand;
    }

    public ToshibaHead getHead() {
        return head;
    }

    public void setHead(ToshibaHead head) {
        this.head = head;
    }

    public SamsungLeg getLeg() {
        return leg;
    }

    public void setLeg(SamsungLeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPriceAll() {
        int price=head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
