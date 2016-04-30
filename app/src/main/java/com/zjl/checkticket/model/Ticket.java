package com.zjl.checkticket.model;

/**
 * Created by zzg on 2016/5/1
 * 票数据类型.
 */
public class Ticket {
    String kind;
    String number;
    String user;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
