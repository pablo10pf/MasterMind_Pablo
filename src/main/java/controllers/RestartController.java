package controllers;

import models.Game;

public class RestartController extends Controller {
    public RestartController(Game game) {
        super(game);
    }

    public void restart() {
        this.game.restartComponents();
    }
}
