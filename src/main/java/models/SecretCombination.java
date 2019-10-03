package models;

import java.util.Collections;
import java.util.Random;

public class SecretCombination extends Combination {

    public SecretCombination() {
        super();
        createSecretCombination();
    }

    public Result calculateResult(UserCombination userCombination) {
        int dead = 0;
        int wounded = 0;
        for (int i = 0; i < this.colors.size(); i++) {
            if (userCombination.containsColorInPosition(this.colors.get(i), i)) {
                dead++;
            } else if (userCombination.containsColor(this.colors.get(i))) {
                wounded++;
            }
        }
        return new Result(userCombination, dead, wounded);
    }

    public void createSecretCombination() {
        Random random = new Random(System.currentTimeMillis());
        for (Color color : Color.values()) {
            this.colors.add(color);
        }
        for (int i = 0; i < Color.values().length - COMBINATION_LENGTH; i++) {
            this.colors.remove(random.nextInt(colors.size()));
        }
        Collections.shuffle(colors, random);
        System.out.println(toString());
    }
}
