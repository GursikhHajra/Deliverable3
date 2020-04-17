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
public class Card {
    public int decksize = 52;
    public GroupOfCards[] cards = new GroupOfCards[decksize];
    
    
    public void deckCreation()
    {
        int count =0;
        
        for(GroupOfCards.CardSuit suit : GroupOfCards.CardSuit.values())
        {
            for(GroupOfCards.CardValue val : GroupOfCards.CardValue.values())
            {
                cards[count] = (new GroupOfCards(val,suit));
                count++;
            }
        }
    }
}
