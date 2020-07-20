package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        if (gameOver){
            System.out.println("Your final score = " + calculateScore(score,levelComplete,bonus));
        }

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        if(gameOver){
            int highScore = calculateScore(score,levelComplete,bonus);
            System.out.println("Your final score is =" + highScore );
        }

        int highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Tim",highScorePosition);

    }

    public static int calculateScore(int score, int levelComplete, int bonus){
        return ( score + (levelComplete * bonus ) );
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println("Play " + playerName + " managed to get into position "+ position);
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        }else if (score > 500 && score < 1000){
            return 2;
        }else if (score > 100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
