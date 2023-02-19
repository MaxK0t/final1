package srevice;

import controller.Film;
import controller.UserController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmServiceImpl implements FilmService {

    private final ArrayList<Film> films = new ArrayList<>();
    private final String space = " ";
    private final UserServiceImpl userService = new UserServiceImpl();
    private final Scanner scannerFilm = new Scanner(System.in);
    private final Film film = new Film();
    private final TicketServiceImpl ticketService = new TicketServiceImpl();


    @Override
    public Film showFilms() {

        Film error = new Film("Error");
        Film venom = new Film("Venom");
        Film batman = new Film("Batman");
        Film superman = new Film("Superman");

        films.add(error);
        films.add(venom);
        films.add(batman);
        films.add(superman);

        System.out.println(venom + space + batman + space + superman);
        System.out.println(" ");
        System.out.println("""
                Enter number:
                                
                1.Buy tickets;
                2.Back menu;
                """);

        int item = scannerFilm.nextInt();
        switch (item) {
            case 1 -> ticketService.buyTickets();
            case 2 -> userService.function();
        }
            /*int item1 = scannerFilm.nextInt();*/

          /*  switch (item1) {
                case 1:
                    showFilms();
                    break;
                case 2:
                    System.out.println("Buy tickets - 1; " + "\n" + "Sell tickets - 2;");
                    int itemBuyAndSell = scannerFilm.nextInt();
                  switch(itemBuyAndSell) {
                      case 1:
                          ticketService.buyTickets();
                  }
            }*/

        return film;
    }

}