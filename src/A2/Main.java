package A2;

public class Main {
    public static void main(String[] args) {
        Person Tabbe = new Person(28, "Tabbe");
        Person Jule = new Person(0, "Jule");
        Person Suze = new Person(11, "Suze");

        Zoo zoo = new Zoo();
        zoo.setTicketPrice(Tabbe);
        System.out.print("Tabbe has to pay: "+ zoo.getTicketPrice()+"\n");
        zoo.setTicketPrice(Jule);
        System.out.print("Jule has to pay: "+ zoo.getTicketPrice()+"\n");
        zoo.setTicketPrice(Suze);
        System.out.print("Suze has to pay: "+ zoo.getTicketPrice()+"\n");
    }
}