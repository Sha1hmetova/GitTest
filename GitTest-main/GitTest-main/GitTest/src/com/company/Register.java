package com.company;

import java.util.ArrayList;

public class Register
{
    ArrayList<User> registrated =new ArrayList<>();


    public  void reg(String name, String pass)
    {
        User user = new User();
        user.getName(name);
        user.getPassword(pass);
        registrated.add(user);

    }
    public void reg(String name)
    {
String gen1 = " ";
String gen = "1234567890";
gen.charAt(1);

    }
    public void del(String name,String pass)
    {
registrated.remove(1);
    }
}
