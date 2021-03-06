package com.example.android.sircleapp;

import java.io.Serializable;

public class DepotUserInfo implements Serializable{

    private String address;
    private String name;
    private String reply;

    public DepotUserInfo() {

    }

    public DepotUserInfo(String address, String name, String reply) {
        this.address = address;
        this.name = name;
        this.reply = reply;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
