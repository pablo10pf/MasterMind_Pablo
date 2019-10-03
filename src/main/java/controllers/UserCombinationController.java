package controllers;

import models.Game;
import models.UserCombination;

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


}
