/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import java.util.Scanner;

/**
 *
 * @author pemas
 */
public class Game {
    static int numVal[] = new int[2];
    static int numSuit[] = new int[2];
    
    public static void main(String[] args) {
        Card card = new Card();
        
        card.deckCreation();
        
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
        String playeronecard = "";
        String playertwocard = "";
        String drawcheck[] = new String[2];
        boolean playagain = false;
        
        System.out.println("Welcome to War\nThis final Deliverable is a game of War between 2 people, first to 10 points wins!\nI hope you enjoy and have fun!\n");
        do
        {
        System.out.println("Please enter the PlayerId of player1");
        players[0].setPlayerId(scan.nextLine());
        do
        {
        System.out.println("Please enter the PlayerId of player2");
        players[1].setPlayerId(scan.nextLine());
        if(players[0].getPlayerId().equals(players[1].getPlayerId()))
                System.out.println("Enter a different PlayerId");
         else
            break;
        }while(players[0].getPlayerId().equals(players[1].getPlayerId()));
        int playeronepoints = 0;
        int playertwopoints = 0;
        int round = 1;
        boolean playerwinlimit = false;
        String playcheck = "";
        
        
        do
        {
        
        do
        {
        System.out.println(players[0].getPlayerId() + ": Enter 'draw' to draw and play a card");
        drawcheck[0]=scan.nextLine();
        System.out.println(players[1].getPlayerId() + ": Enter 'draw' to draw and play a card");
        drawcheck[1]=scan.nextLine();
        if(!(drawcheck[0].equals("draw")) || !(drawcheck[1].equals("draw")))
                System.out.println("Please enter 'draw' exactly as it is, no other way");
        }while(!(drawcheck[0].equals("draw")) || !(drawcheck[1].equals("draw")));
        
        do
        {
            System.out.println("Round " + round + "!");
        playeronecard = drawCard(1);
        playertwocard = drawCard(2);
        
        
        System.out.println(players[0].getPlayerId() + " drew " + playeronecard);
        System.out.println(players[1].getPlayerId() + " drew " + playertwocard);
        if(numVal[0] > numVal[1])
        {
            System.out.println(players[0].getPlayerId() + " wins!");
            playeronepoints = playeronepoints + 1;
            if(playeronepoints == 10)
            {
                playerwinlimit = true;
            }
        }
        else if(numVal[0] < numVal[1])
        {
            System.out.println(players[1].getPlayerId() + " wins!");
            playertwopoints =  playertwopoints + 1;
            if(playertwopoints == 10)
            {
                playerwinlimit = true;
            }
        }
        else
        {
            System.out.println("Theres been a tie!");
        }
        }while(numVal[0] == numVal[1]);
        round = round + 1;
        System.out.println(players[0].getPlayerId() + "'s points currently are: " + playeronepoints);
        System.out.println(players[1].getPlayerId() + "'s points currently are: " + playertwopoints);
        }while(!playerwinlimit);
        
        if(playeronepoints == 10)
            System.out.println(players[0].getPlayerId() + " wins this match of War!");
        else if (playertwopoints == 10)
            System.out.println(players[1].getPlayerId() + " wins this match of War!");
        
        do
        {
        System.out.println("Would you like to play again?\nEnter 'yes' to play again and 'no' to stop");
        playcheck = scan.nextLine();
        if(playcheck.equals("yes"))
        {
            playagain = true;
            break;
        }
        else if(playcheck.equals("no"))
        {
            playagain = false;
            break;
        }
        else
            System.out.println("Please enter 'yes' or 'no' exactly as it is");
        }while(!(playcheck.equals("yes")) || !(playcheck.equals("no")));
        
         }while(playagain);
        System.out.println("Thanks for Playing");
        
    }
    
    public static String drawCard(int num)
    {
        if(num == 1)
        {
        numVal[0] = (int) (Math.random() * GroupOfCards.CardValue.values().length);
        numSuit[0] = (int) (Math.random() * GroupOfCards.CardSuit.values().length);
        }
        if(num == 2)
        {
        numVal[1] = (int) (Math.random() * GroupOfCards.CardValue.values().length);
        numSuit[1] = (int) (Math.random() * GroupOfCards.CardSuit.values().length);
        }
        
     
      if(num == 1)
        return GroupOfCards.CardValue.values()[numVal[0]].name() + " of " + GroupOfCards.CardSuit.values()[numSuit[0]].name();
      else if(num == 2)
        return GroupOfCards.CardValue.values()[numVal[1]].name() + " of " + GroupOfCards.CardSuit.values()[numSuit[1]].name();
      else
        return GroupOfCards.CardValue.ACE.name() + " of " + GroupOfCards.CardSuit.DIAMONDS.name();
    }
    
}
