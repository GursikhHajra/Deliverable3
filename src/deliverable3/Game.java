/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

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
    }
    
}
