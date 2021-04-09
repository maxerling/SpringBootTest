package com.backend.uppgift2.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-08
 * Copyright: MIT
 * Class: Java20B
 */
public class Kompis {
    private int id;
    private String name;
    private String nick;
    private String birthday;
    private List<String> streetAddress;
    private List<String> phoneNumbers;

    public Kompis(int id, String name, String nick, String birthday, List<String> streetAddress, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.nick = nick;
        this.birthday = birthday;
        this.streetAddress = streetAddress;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(List<String> streetAddress) {
        this.streetAddress = streetAddress;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
