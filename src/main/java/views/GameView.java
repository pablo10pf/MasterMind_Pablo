package views;

import controllers.RestartController;
import controllers.StartController;
import controllers.UserCombinationController;
import models.Game;
import models.UserCombination;

import java.util.Scanner;

public class GameView {
    protected Game game;
    private StartView startView;
    private RestartView restartView;
    private UserCombinationView userCombinationView;
    private ResultView resultView;

    /*public GameView(Game game) {
        this.game = game;
    }*/
    public GameView(StartController startController, RestartController restartController, UserCombinationController
                    userCombinationController){
        this.startView=new StartView(startController);
        this.restartView=new RestartView(restartController);
        //this.userCombinationView= new UserCombinationView(userCombinationController);
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

    //TODO comprobar user combination: no implemetado

    private boolean typeUserCombination(){
        return this.userCombinationView.act();
    }

    private boolean restart(){
       return this.restartView.act();
    }

}
