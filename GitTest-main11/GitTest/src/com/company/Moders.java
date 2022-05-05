package com.company;

public class Moders implements Users{
    String name;
    String password;
    int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public void writeMassage() {

    }
}
