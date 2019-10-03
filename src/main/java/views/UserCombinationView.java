package views;

import controllers.UserCombinationController;
import models.Color;
import models.Combination;
import models.UserCombination;

import java.util.Scanner;

public class UserCombinationView {

    UserCombinationController userCombinationController;
    ResultView resultView;
    public UserCombinationView(UserCombinationController userCombinationController, ResultView resultView){
        this.userCombinationController=userCombinationController;
        this.resultView=new ResultView(this.userCombinationController);
    }

    public UserCombination readCombinatiion() {
        Scanner scanner = new Scanner(System.in);
        String userCombinationString;
        do {
            System.out.println("Type your Combination. 4 colors (R, B, Y, G, O, P):");
            userCombinationString=scanner.next();
        }while(!checkUserEntry(userCombinationString));
        return new UserCombination(userCombinationString);
    }

    public  boolean checkUserEntry(String userEntry) {
        if(userEntry.length()!=4) {
            System.out.println("Error. Type only 4 letters.");
            return false;
        }
        else if(!checkRepeatedLetters(userEntry)) {
            System.out.println("Error. Don´t repeat colors.");
            return false;
        }
        else  if(!checkValidLetters(userEntry)) {
            System.out.println("Error. Colors (R, B, Y, G, O, P).");
            return false;
        }

        else return true;
    }

    public  boolean checkValidLetters(String userEntry) {
        int validLetters=0;
        for (int i = 0; i <UserCombination.getCombinationLength(); i++) {
            for (Color color : Color.values()) {
                System.out.println("+++++++ "+color.name()+"---");
                System.out.println("------- "+String.valueOf(userEntry.charAt(i))+"---");
                if (color.name().equals(String.valueOf(userEntry.charAt(i)))) {
                    validLetters++;
                    System.out.println("validas: "+validLetters);
                }
            }
        }
        if(validLetters==Combination.getCombinationLength()){
            return true;
        }else {
            return false;
        }
    }

    public  boolean checkRepeatedLetters(String userEntry) {
        for (int i = 0; i < UserCombination.getCombinationLength(); i++) {
            for (int j = 0; j <UserCombination.getCombinationLength(); j++) {
                if( i!=j && userEntry.charAt(i)==userEntry.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
