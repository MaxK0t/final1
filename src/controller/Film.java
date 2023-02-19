package controller;

public class Film {

    private String films;
    public Film() {

    }

    public Film(String films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Films: " + films + ";";
    }
}
