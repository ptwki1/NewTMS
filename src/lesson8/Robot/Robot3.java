package lesson8.Robot;
import lesson8.Robot.Hands.ToshibaHand;
import lesson8.Robot.Heads.SonyHead;
import lesson8.Robot.Legs.SonyLeg ;

public class Robot3 implements IRobot {
    private ToshibaHand hand;
    private SonyHead head;
    private SonyLeg leg;

    public Robot3(ToshibaHand hand, SonyHead head, SonyLeg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Robot3() {
    }

    public ToshibaHand getHand() {
        return hand;
    }

    public void setHand(ToshibaHand hand) {
        this.hand = hand;
    }

    public SonyHead getHead() {
        return head;
    }

    public void setHead(SonyHead head) {
        this.head = head;
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
