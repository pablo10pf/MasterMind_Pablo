package views;

import models.Result;
import java.util.ArrayList;

public class ResultView {
    private ArrayList<Result> results;

    public ResultView(ArrayList<Result> results) {
        this.results = results;
    }

    public void printResultMessage() {
        int chance=1;
        for(Result result : results) {
            System.out.println("Chance "+chance+": "+result.toString());
            chance++;
        }
    }
}
