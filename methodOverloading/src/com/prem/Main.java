package com.prem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 10);
        System.out.println("New score is ="+newScore);
        newScore = calculateScore(50);
        System.out.println("New score is ="+newScore);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " has scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player has scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No Player no score");
        return 0;
    }
}
