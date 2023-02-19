package controller;

public class Ticket {
    public Ticket() {

    }

    String tickets;

    @Override
    public String toString() {
        return tickets;
    }

    public Ticket (String tickets) {
            this.tickets = tickets;
        }

}
