import models.Game;
import views.GameView;

public class Mastermind {

    private Game game;
    private GameView gameView;

    public Mastermind(){
        this.game= new Game();
        this.gameView= new GameView(game);
    }

    public static void main(String[] args) {
        new Mastermind().start();

    }
    public void start(){
        gameView.interact();
    }
}