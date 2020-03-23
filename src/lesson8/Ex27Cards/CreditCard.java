package lesson8.Ex27Cards;

public class CreditCard extends  Cards {
    int limit;

    public CreditCard(int id, String payment_system, String name_user, int limit) {
        super(id, payment_system, name_user);
        this.limit = limit;
    }

    public String toString() {
        return "CreditCard{limit=" + this.limit + ", id=" + this.id + ", payment_system='" + this.payment_system + "', name_user='" + this.name_user + "'}";
    }
}
