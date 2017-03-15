package com.codeclan.rockpaperscissorsactivity;

/**
 * Created by user on 15/03/2017.
 */

public enum Hand {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int number;

    Hand(int number){
        this.number = number;
    }

    public String toString(){
        switch(this) {
            case ROCK: return "Rock";
            case PAPER: return "Paper";
            case SCISSORS: return "Scissors";
            default: return "No hand";
        }
    }

    public int getValue(){
        return number;
    }
}
