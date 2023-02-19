package repository;

import ConectionManager.ConnectionManager;
import controller.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository implements Repository<User>{

    @Override
    public boolean create(User user) {
        try (Connection conn = ConnectionManager.open()) {
            System.out.println("Connection to Store DB successful!");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Users (login, password) VALUES (?,?)");
            stmt.setString(1, user.getLogin());
            stmt.setString(2, user.getPassword());
            stmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User create(String login, String password) {
        return null;
    }


}
