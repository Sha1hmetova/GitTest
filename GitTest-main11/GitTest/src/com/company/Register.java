package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Register {
    ArrayList<User> registrated = new ArrayList<>();

    public void reg(String name, String pass) {
        User new_user = new User();
        new_user.setName(name);
        new_user.setPassword(pass);
        registrated.add(new_user);
    }
    public int random (int max, int min)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

        public void reg(String name) {
            String pass = " ";
            String gen = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

            for (int i = 0; i < 10 ; ++i )
            {
                pass+=gen.charAt(random(0,gen.length()));
            }

            User new_user = new User();
            new_user.setName(name);
            new_user.setPassword(pass);
            registrated.add(new_user);

        }


    public void del (String name, String pass)
        {

        for( int i = 0; i < registrated.size(); ++i){
            if (registrated.get(i).getPassword().equals(pass)&&
            registrated.get(i).getName().equals(name)){
                registrated.remove(registrated.get(i));
                break;
            }

        }
        }

    }
