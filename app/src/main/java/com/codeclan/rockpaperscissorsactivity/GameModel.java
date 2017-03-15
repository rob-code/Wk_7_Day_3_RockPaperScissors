package com.codeclan.rockpaperscissorsactivity;

import java.util.Random;

/**
 * Created by user on 15/03/2017.
 */

public class GameModel {

    private String hand;
    private String computerHand;

    public GameModel(String hand) {
        this.hand = hand;
        this.computerHand = "";
    }

    public String getPlayerHand() {
        return hand;
    }

//    public String getComputerHand() {
//        computerHand = getRandomHand();
//        return computerHand;
//    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getRandomHand() {
        Random rand = new Random();
        int x = rand.nextInt(3);
        String randomHand = Hand.values()[x].toString();
        return randomHand;
    }

    public String whoWon() {
        this.computerHand = this.getRandomHand();
        if (this.hand.equals(this.computerHand)) {
            return "It's a draw!\nThe human played " + hand + " \nThe computer played " + computerHand;
        } else if ((hand.equals("Rock") && computerHand.equals("Scissors")) || (hand.equals("Paper") && computerHand.equals("Rock")) || (hand.equals("Scissors") && computerHand.equals("Paper"))) {
            return "Player wins!\nThe human played " + hand + " \nThe computer played " + computerHand;
        } else {
            return "Computer wins! \nThe human played " + hand + " \nThe computer played " + computerHand;
        }
    }

}
