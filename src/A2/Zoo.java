package A2;

public class Zoo {
    private int ticketPrice = 0;

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Person person) {
        this.ticketPrice = calculateTicketPrice(person);
    }

    public int calculateTicketPrice(Person person) {
        int ticketPrice = 0;
        if (5 < person.getAge() && person.getAge() <= 12) {
            ticketPrice = 5;
        }
        else if (12 < person.getAge()) {
            ticketPrice = 15;
        }
        return ticketPrice;
    }
}