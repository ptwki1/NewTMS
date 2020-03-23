package lesson8.Ex27Cards;

public class DebitCardsWithOverdraft extends DebitCards {
    int overdraft;

    public DebitCardsWithOverdraft(int id, String payment_system, String name_user, String date_of_issue, String period_of_validity, int overdraft) {
        super(id, payment_system, name_user, date_of_issue, period_of_validity);
        this.overdraft = overdraft;
    }



    public String toString() {
        return "DebitCardWithOverdraft{overdraft=" + this.overdraft + ", date_of_issue=" + this.date_of_issue + ", period_of_validity=" + this.period_of_validity + ", id=" + this.id + ", payment_system='" + this.payment_system + "', name_user='" + this.name_user + "'}";
    }
}

