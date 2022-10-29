package ru.job4j.assertj;

public class SimpleModel {
    private String name = "";

    public String getName() {
        if (name.length() == 0) {
            throw new IllegalArgumentException();
        }
        return name;
    }

    public void setName(String wold, int number) {
        if (wold.length() != number) {
            throw new IllegalArgumentException(String.format(
                    "this word: %s has length not equal to : %s", wold, number)
            );
        }
        this.name = wold;
    }
}
