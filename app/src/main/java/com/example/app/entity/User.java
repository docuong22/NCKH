package com.example.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private long id;
    private long phone;
    private String name;
    private String address;

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddRess() {
        return address;
    }

    public void setAddRess(String addRess) {
        this.address = addRess;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", addRess='" + address + '\'' +
                '}';
    }
}
