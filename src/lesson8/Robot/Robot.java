package lesson8.Robot;
import lesson8.Robot.Hands.SamsungHand;
import lesson8.Robot.Heads.SamsungHead;
import lesson8.Robot.Legs.SonyLeg;

public class Robot implements IRobot {

    private SamsungHead head;
    private SamsungHand hand;
    private SonyLeg leg;

    public Robot(SamsungHead head, SamsungHand hand, SonyLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public SamsungHead getHead() {
        return head;
    }

    public void setHead(SamsungHead head) {
        this.head = head;
    }

    public SamsungHand getHand() {
        return hand;
    }

    public void setHand(SamsungHand hand) {
        this.hand = hand;
    }

    public SonyLeg getLeg() {
        return leg;
    }

    public void setLeg(SonyLeg leg) {
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
