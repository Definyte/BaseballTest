/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author niepp7406
 */

public class Stats {
    public Stats(){
        super();
    }
    
    public int overallPoints(int gamesWon, int gamesLost, int gamesDraw){
        gamesWon = 3;
        gamesLost = 4;
        gamesDraw = 2;
        int points = (gamesWon * 2)+(gamesDraw * 1);
        return points;
    }
}
