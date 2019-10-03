import controllers.RestartController;
import controllers.StartController;
import models.Game;
import views.GameView;

public class Mastermind {

    private Game game;
    private GameView gameView;
    private StartController startController;
    private RestartController restartController;

    public Mastermind(){
        this.game= new Game();
        this.startController = new StartController(game);
        this.restartController = new RestartController(game);
        this.gameView= new GameView(startController,restartController);
    }

    public static void main(String[] args) {
        new Mastermind().start();

    }
    public void start(){
        gameView.act();
    }
}