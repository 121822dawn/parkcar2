package com.cn.pojo;

public class park {
    private int id;
    private String license_number;
    private String putin;
    private String putout;
    private double money;


    public park() {
    }

    public park(int id, String license_number, String putin, String putout, int money) {
        this.id = id;
        this.license_number = license_number;
        this.putin = putin;
        this.putout = putout;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getPutin() {
        return putin;
    }

    public void setPutin(String putin) {
        this.putin = putin;
    }

    public String getPutout() {
        return putout;
    }

    public void setPutout(String putout) {
        this.putout = putout;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
