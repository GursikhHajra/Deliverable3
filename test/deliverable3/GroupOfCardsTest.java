/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lataw
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
        
        
    }
    
    
    /**
     * Test of getCardVal method, of class GroupOfCards.
     */
    @Test
    public void testGetCardVal() {
        System.out.println("getCardVal");
        GroupOfCards instance = null;
        GroupOfCards.CardValue expResult = null;
        GroupOfCards.CardValue result = instance.getCardVal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCardSuit method, of class GroupOfCards.
     */
    @Test
    public void testGetCardSuit() {
        System.out.println("getCardSuit");
        GroupOfCards instance = null;
        GroupOfCards.CardSuit expResult = null;
        GroupOfCards.CardSuit result = instance.getCardSuit();
        assertEquals(expResult, result);
    }
    
    
    
}
