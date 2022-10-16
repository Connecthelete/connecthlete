package com.example.connecthlete;

public class Player {
    private String username;
    private String number;
    private String password;
    private String sport;

    public Player() {}
    public Player(String username, String number, String password, String sport) {
        this.username = username;
        this.number = number;
        this.password = password;
        this.sport = sport;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return password;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
