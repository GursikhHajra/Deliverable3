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
public class GroupOfCards {
    
    public enum CardValue  {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    public enum CardSuit {SPADES,CLUBS,HEARTS,DIAMONDS};
    private final CardValue cardValue;
    private final CardSuit cardSuit;
    
    public GroupOfCards(CardValue cardval,CardSuit cardsuit)
    {
        cardValue = cardval;
        cardSuit = cardsuit;
    }
    
    public CardValue getCardVal()
    {
        return this.cardValue;
    }
    
    public CardSuit getCardSuit()
    {
        return this.cardSuit;
    }
}
