package views;

import controllers.RestartController;
import controllers.StartController;
import models.Game;
import models.UserCombination;

import java.util.Scanner;

public class GameView {
    protected Game game;
    private StartView startView;
    private RestartView restartView;

    /*public GameView(Game game) {
        this.game = game;
    }*/
    public GameView(StartController startController, RestartController restartController){
        this.startView=new StartView(startController);
        this.restartView=new RestartView(restartController);
    }

   /* public void act() {
        boolean end = false;
        boolean win = false;
        boolean restart = false;
        do {
            System.out.println("Wellcome to MasterMind!");
            do {
                UserCombination userCombination = new UserCombinationView().readCombinatiion();
                this.game.addUserCombination(userCombination);
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
    }*/

   public void act(){
       boolean end = false;
       boolean win = false;
       boolean restart = false;
       do{
           start();
           do{
               end= typeUserCombination();
           }while(!end);
           restart=this.restart();
       }while(!restart);
   }
    private void start() {
        this.startView.act();
    }

    //TODO comprobar user combination
    private boolean typeUserCombination(){
        return true;
    }

    private boolean restart(){
       return this.restartView.act();
    }

}
