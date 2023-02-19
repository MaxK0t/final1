package repository;

public interface Repository<T> {

    boolean create (T t );

    T create (String login, String password);

}
