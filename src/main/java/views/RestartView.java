package views;

import controllers.RestartController;
import models.Game;

import java.util.Scanner;

public class RestartView {
    private RestartController restartController;
    public RestartView(RestartController restartController){
        this.restartController=restartController;
    }

    public boolean act() {
        Scanner scanner = new Scanner(System.in);
        char response;
        do {
            response = scanner.next().charAt(0);
            if(response !='n' && response !='N' && response !='y' && response !='Y'){
                System.out.println("Error. Type y/Y or n/N");
            }
        } while (response !='n' && response !='N' && response !='y' && response !='Y');
        if (response == 'y' || response == 'Y') {
            restartController.restart();
            return true;
        } else {
            return false;
        }
    }
}
