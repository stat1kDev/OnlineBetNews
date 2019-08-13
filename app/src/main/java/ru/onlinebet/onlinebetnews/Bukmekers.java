package ru.onlinebet.onlinebetnews;

public class Bukmekers {

    private String number;
    private int bukName;
    private int bukStars;

    public Bukmekers(String number, int bukName, int bukStars) {
        this.number = number;
        this.bukName = bukName;
        this.bukStars = bukStars;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBukName() {
        return bukName;
    }

    public void setBukName(int bukName) {
        this.bukName = bukName;
    }

    public int getBukStars() {
        return bukStars;
    }

    public void setBukStars(int bukStars) {
        this.bukStars = bukStars;
    }
}
