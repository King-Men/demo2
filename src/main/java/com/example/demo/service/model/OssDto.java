package com.example.demo.service.model;

public class OssDto {
    private int id;
    private String name;
    private int nmb;

    public OssDto(int id, String name, int nmb) {
        this.id = id;
        this.name = name;
        this.nmb = nmb;
    }

    public OssDto() {
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
