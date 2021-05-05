package com.example.demo.control.model;

public class oss {
    private int id;
    private String name;
    private int nmb;

    public oss() {
    }

    public oss(int id, String name, int nmb) {
        this.id = id;
        this.name = name;
        this.nmb = nmb;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getNmb() {
        return nmb;
    }
    public void setNmb(int nmb) {
        this.nmb = nmb;
    }
}
