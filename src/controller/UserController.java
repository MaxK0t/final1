package controller;

import srevice.*;

import java.util.Scanner;

public class UserController {

    private final UserService userService = new UserServiceImpl();
    private final FilmService filmService = new FilmServiceImpl();
    private final TicketService ticketService = new TicketServiceImpl();
    Scanner sc = new Scanner(System.in);

    public void registration() {

        System.out.println("Registration");
        userService.registration();
    }

    public void userMenu() {
        userService.function();
        int itemUserMenu = sc.nextInt();

        switch (itemUserMenu) {
            case 1:
                filmService.showFilms();
                break;
            case 2:
                System.out.println("1.Buy ticket; 2.Back menu;");
                ticketService.buyTickets();
                break;

        }
    }
}
