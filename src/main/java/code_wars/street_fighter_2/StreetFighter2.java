package main.java.code_wars.street_fighter_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreetFighter2 {

    public static void main(String[] args) {
        String[][] fighters = {{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"}};
        int[] position = {0,0};
        String[] moves = {"up", "left", "right", "left", "left"};
        System.out.println("streetFighterSelection(fighters,position,moves) = " + Arrays.toString(streetFighterSelection(fighters, position, moves)));
    }

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
        List<String> result = new ArrayList<>();
        int x = position[0];
        int y = position[1];
        for(String move : moves){
            switch (move.toLowerCase()){
                case "up": if (x == 1) x = 0; break;
                case "down": if (x == 0) x = 1; break;
                case "right":if (y == 5) y = 0; else y++; break;
                case "left": if (y == 0) y = 5; else y--; break;
                default: break;
            }
            result.add(fighters[x][y]);
        }
        return result.toArray(String[]::new);
    }
}
