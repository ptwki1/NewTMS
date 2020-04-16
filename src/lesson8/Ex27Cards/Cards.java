package lesson8.Ex27Cards;

public class Cards {
    int id;
    String payment_system;
    String name_user;

    public Cards(int id, String payment_system, String name_user) {
        this.id = id;
        this.payment_system = payment_system;
        this.name_user = name_user;
    }

    public String toString() {
        return "Cards{id=" + this.id + ", payment_system='" + this.payment_system + "', name_user='" + this.name_user + "'}";
    }
}
