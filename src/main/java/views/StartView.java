package views;

import controllers.StartController;

public class StartView {
    private StartController startController;
    private SecretCombinationView secretCombinationView;

    public StartView(StartController startController){
        this.startController=startController;
        this.secretCombinationView = new SecretCombinationView(this.startController);
    }

    public void act(){
        System.out.println("Wellcome to MasterMind!");
        secretCombinationView.act();
    }
}
