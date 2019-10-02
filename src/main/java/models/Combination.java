package models;

import java.util.ArrayList;

public class Combination {
    protected static final int COMBINATION_LENGTH=4;
    protected ArrayList<Color> colors;

    public Combination() {
        this.colors=new ArrayList<Color>();
    }
    public static int getCombinationLength() {
        return COMBINATION_LENGTH;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }


}
