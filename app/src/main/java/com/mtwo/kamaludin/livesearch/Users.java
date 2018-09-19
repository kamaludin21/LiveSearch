package com.mtwo.kamaludin.livesearch;

import com.google.gson.annotations.SerializedName;

public class Users {

    @SerializedName("id") private int Id;
    @SerializedName("name") private String Name;
    @SerializedName("email") private String Email;

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
