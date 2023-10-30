package ru.mirea.kabo0222.task1;
import java.lang.String;
public class Author {
    private String name;
    private String email;
    private char gender;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Author(String name, String email, char gender, int page) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", page=" + page +
                '}';
    }
}