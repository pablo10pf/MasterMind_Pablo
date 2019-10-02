package views;

import models.Result;
import java.util.ArrayList;

public class ResultView {
    private ArrayList<Result> results;

    public ResultView(ArrayList<Result> results) {
        this.results = results;
    }

    public void printResultMessage() {
        for(Result result : results) {
            System.out.println(result.toString());
        }
    }
}
