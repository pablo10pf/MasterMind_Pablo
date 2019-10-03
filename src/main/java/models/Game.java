package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Game {
    final static int MAX_CHANCES = 10;

    private SecretCombination secretCombination;
    private ArrayList<UserCombination> userCombinations;
    private ArrayList<Result> results;

    public Game(){
        this.secretCombination= new SecretCombination();
        this.userCombinations = new ArrayList<UserCombination>();
        this.results= new ArrayList<Result>();
    }

    public void addProposedCombination(UserCombination userCombination) {
        this.userCombinations.add(userCombination);
        this.results.add(this.secretCombination.calculateResult(userCombination));
    }

    public boolean isWinner(){
        return this.results.get(results.size() -1).win();
    }

    public boolean isFinished(){
        return results.size()==MAX_CHANCES;
    }

    public ArrayList<Result> getResults() {
        return this.results;
    }
}
