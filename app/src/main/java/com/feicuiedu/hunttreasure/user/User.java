package com.feicuiedu.hunttreasure.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gqq on 2017/1/9.
 */
public class User {


    public User(String name, String password) {
        this.name = name;
        Password = password;
    }
    /**
     * UserName : qjd
     * Password : 654321
     *
     * GsonFormat
     */
    @SerializedName("UserName")
    private String name;

    private String Password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
