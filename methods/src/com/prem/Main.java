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
            System.out.println("Your final score is =" + calculateScore(score,levelComplete,bonus));
        }
    }

    public static int calculateScore(int score, int levelComplete, int bonus){
        return ( score + (levelComplete * bonus ) );
    }
}
