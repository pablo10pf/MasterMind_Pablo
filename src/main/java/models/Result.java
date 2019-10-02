package models;

public class Result {
    private UserCombination userCombination;
    int wounded;
    int dead;

    public Result(UserCombination userCombination,int dead, int wounded){
        this.userCombination=userCombination;
        this.wounded=wounded;
        this.dead=dead;
    }

    public boolean win(){
        return dead == Combination.COMBINATION_LENGTH;
    }

    public String toString(){
        return "Combination: "+userCombination.getColors()
                +". Deads: "+dead+" | Wounded: "+wounded;
    }
}
