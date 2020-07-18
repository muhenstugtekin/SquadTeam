package com.example.squadteam;

import java.io.Serializable;
import java.util.ArrayList;

public class Liga implements Serializable {

    private String name;
    private String teamList;
    private int pictureInteger;

    public Liga(String name, String teamList, int pictureInteger) {
        this.name = name;
        this.teamList = teamList;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getTeamList() {
        return teamList;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
