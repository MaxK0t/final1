package srevice;

import controller.User;
import repository.Repository;
import repository.UserRepository;

import java.util.Scanner;

public class UserServiceImpl implements UserService {

    private final User user = new User();
    Scanner scannerUser = new Scanner(System.in);


    @Override
    public User registration(){
        Repository<User> userRepository = new UserRepository();


        System.out.println("Enter your login: ");
        String login = scannerUser.nextLine();
        user.setLogin(login);


        System.out.println("Password: ");
        String password = scannerUser.nextLine();
        user.setPassword(password);

        userRepository.create(user);
        System.out.println(login + " " + password);

        userRepository.create(user);
        return user;
    }

    @Override
    public void function() {
        System.out.println("""
                Enter for function: 
                                        
                1.Show all films;
                2.Buy and sell tickets;
                3.Viewing tickets;
                """);
    }
}
