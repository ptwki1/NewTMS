package lesson8.Ex27Cards;

public class Runner {
    public static void main(String[] agrs) {
        Cards test = new Cards(11111, "VISA", "Jon");
        DebitCards test2 = new DebitCards(111111111, "mastercard", "jonn", "12/12", "12/16");
        DebitCardsWithOverdraft test3 = new DebitCardsWithOverdraft(2222, "Viiisa", "Mia", "14/20", "12/21", 3000);
        CreditCard test4 = new CreditCard(55555, "visa", "Evpat", 5000);
        System.out.println("********");
        System.out.println(test.toString());
        System.out.println("********");
        System.out.println(test2.toString());
        System.out.println("********");
        System.out.println(test3.toString());
        System.out.println("********");
        System.out.println(test4.toString());
        System.out.println("********");
    }
}
