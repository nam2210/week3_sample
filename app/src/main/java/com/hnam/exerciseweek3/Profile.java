package com.hnam.exerciseweek3;

/**
 * Created by nampham on 3/10/18.
 */

public class Profile {
    private String name;
    private String email;

    public Profile() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
