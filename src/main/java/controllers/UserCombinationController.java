package controllers;

import models.Game;
import models.Result;
import models.UserCombination;

import java.util.ArrayList;

public class UserCombinationController extends Controller {
    public UserCombinationController(Game game){
        super(game);
    }

    public void addUserCombination(UserCombination userCombination){
        game.addUserCombination(userCombination);
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isFinished() {
        return this.game.isFinished();
    }

    public ArrayList<Result> getResults() {
        return this.game.getResults();
    }


}
