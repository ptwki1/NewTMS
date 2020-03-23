package lesson8.Ex27Cards;

public class DebitCards extends Cards {
    String date_of_issue;
    String period_of_validity;

    public DebitCards(int id, String payment_system, String name_user, String date_of_issue, String period_of_validity) {
        super(id, payment_system, name_user);
        this.date_of_issue = date_of_issue;
        this.period_of_validity = period_of_validity;
    }

    public String toString() {
        return "DebitCards{date_of_issue=" + this.date_of_issue + ", period_of_validity=" + this.period_of_validity + ", id=" + this.id + ", payment_system='" + this.payment_system + "', name_user='" + this.name_user + "'}";
    }
}


