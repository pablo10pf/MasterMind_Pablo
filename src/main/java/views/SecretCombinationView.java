package views;

import controllers.StartController;

public class SecretCombinationView {
    private StartController startController;

    SecretCombinationView(StartController startController) {
        this.startController = startController;
    }

    void act(){
        System.out.println("Secret Combination Created");
    }
}
