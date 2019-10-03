package views;

import controllers.UserCombinationController;
import models.Result;
import java.util.ArrayList;

public class ResultView {
    private ArrayList<Result> results;
    private UserCombinationController userCombinationController;
   /* public ResultView(ArrayList<Result> results) {
        this.results = results;
    }*/

   public ResultView(UserCombinationController userCombinationController){
       this.userCombinationController= userCombinationController;
   }
    public void printResultMessage() {
        int chance=1;
        for(Result result : results) {
            System.out.println("Chance "+chance+": "+result.toString());
            chance++;
        }
    }
}
