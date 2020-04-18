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
    
    public static void main(String[] args) {
        Card card = new Card();
        
        card.deckCreation();
        
        for(GroupOfCards group : card.cards)
        {
            System.out.println(group.getCardVal() + " of " + group.getCardSuit());
        }
        
        Scanner scan = new Scanner(System.in);
        Player[] players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
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
        System.out.println("You got here");
    }
    
}
