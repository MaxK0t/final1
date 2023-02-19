package srevice;


import controller.Ticket;
import controller.User;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketServiceImpl implements TicketService {
    User user = new User();
    Ticket ticket = new Ticket();
    ArrayList<Ticket> tickets = new ArrayList<>();
    Scanner scannerTicket = new Scanner(System.in);
    String firstName = user.getLogin();
    String lastName = user.getPassword();

    @Override
    public Ticket buyTickets() {


        System.out.println("Number of films: 1.Venom; 2.Batman; 3.Superman");
        Ticket error = new Ticket("Error");
        Ticket venom = new Ticket("Venom");
        Ticket batman = new Ticket("Batman");
        Ticket superman = new Ticket("Superman");

        tickets.add(error);
        tickets.add(venom);
        tickets.add(batman);
        tickets.add(superman);


        int ticketsBuy = scannerTicket.nextInt();


        switch (ticketsBuy) {
            case 1 -> System.out.println(firstName + " " + lastName + " buy ticket on " + venom);
            case 2 -> System.out.println(firstName + " " + lastName + " buy ticket on " + batman);
            case 3 -> System.out.println(firstName + " " + lastName + " buy ticket on " + superman);
        }
        if (ticketsBuy > 3 || ticketsBuy <= 0)
            System.out.println("Error try again!");

        return ticket;
    }

   /* @Override
    public String toString() {
        return  firstName + lastName;
    }*/
}
