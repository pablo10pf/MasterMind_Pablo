package models;

import java.util.Random;

public enum Color{
    R("Red"),
    B("Blue"),
    Y("Yellow"),
    G("Green"),
    O("Orange"),
    P("Purple");


    private final String code;

    Color(String code) {
        this.code=code;
    }
    public String getCode() {
        return code;
    }

}