package models;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCombination extends Combination {

    final static int LONGITUD_CODIGO = 4;

    public UserCombination(String userCombination) {
        super();
        for (int i = 0; i < userCombination.length(); i++) {
            switch (userCombination.charAt(i)) {
                case 'R':
                    this.colors.add(Color.R);
                    break;
                case 'B':
                    this.colors.add(Color.B);
                    break;
                case 'Y':
                    this.colors.add(Color.Y);
                    break;
                case 'G':
                    this.colors.add(Color.G);
                    break;
                case 'O':
                    this.colors.add(Color.O);
                    break;
                case 'P':
                    this.colors.add(Color.P);
                    break;
            }
        }
    }

    public boolean containsColorInPosition(Color color, int position){
        return colors.get(position) == color;
    }

    public boolean containsColor(Color color){
        for (int i = 0; i < colors.size() ; i++) {
            if(colors.get(i)==color){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    /*public void askCombination() {
        String user_entry;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Type your combination");
            user_entry= scanner.nextLine().toString();
        }while(!checkUserEntry(user_entry));
    }*/
}