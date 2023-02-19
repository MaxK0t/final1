package main;



import controller.FilmController;
import controller.UserController;



public class Main {

    private static UserController userController;
    private static FilmController filmController;

    public static void main(String[] args){
            UserController userController = new UserController();
            userController.registration();
            userController.userMenu();

    }
}
