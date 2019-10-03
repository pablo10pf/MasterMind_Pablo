package views;

import models.Game;
import models.UserCombination;

import java.util.Scanner;

public class GameView {
    protected Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void interact() {
        boolean end = false;
        boolean win = false;
        boolean restart = false;
        do {
            System.out.println("Wellcome to MasterMind!");
            do {
                UserCombination userCombination = new UserCombinationView().readCombinatiion();
                this.game.addProposedCombination(userCombination);
                new ResultView(this.game.getResults()).printResultMessage();
                win=this.game.isWinner();
                if(win){
                    end=true;
                }else{
                    end = this.game.isFinished();
                }
            } while (!end);
            if(win){
                System.out.println("WINNER!. Try Again? y/Y-n/N");
            }else{
                System.out.println("GAME OVER!. Try Again? y/Y-n/N");
            }
            restart = this.restart();
        } while (restart);
    }
    private boolean restart() {
        Scanner scanner = new Scanner(System.in);
        char response;
        do {
            response = scanner.next().charAt(0);
            if(response !='n' && response !='N' && response !='y' && response !='Y'){
                System.out.println("Error. Type y/Y or n/N");
            }
        } while (response !='n' && response !='N' && response !='y' && response !='Y');
        if (response == 'y' || response == 'Y') {
            game=new Game();
            return true;
        } else {
            return false;
        }
    }
}
