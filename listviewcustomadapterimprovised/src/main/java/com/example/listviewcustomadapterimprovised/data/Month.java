package com.example.listviewcustomadapterimprovised.data;

public class Month {
    String name;
    String description;
    int id;

    public Month(String n, String d, int i) {
        this.name = n;
        this.description = d;
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
