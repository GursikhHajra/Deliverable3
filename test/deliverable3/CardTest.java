/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import org.junit.Test;

/**
 *
 * @author lataw
 */
public class CardTest {
    
    public CardTest() {
        
        
    }

    
    @Test
    public void testDeckCreation() {
        System.out.println("deckCreation");
        Card instance = new Card();
        instance.deckCreation();
        int expResult = 52;
        assertEquals(expResult,instance.decksize,instance.cards.length);
    }
    
    @Test
    public void testDeckCreation1() {
        System.out.println("Check");
        Card instance = new Card();
        instance.deckCreation();
        assertTrue(52 == instance.decksize);
    }
    
    @Test
    public void testDeckCreation2() {
        System.out.println("Range creation");
        Card instance = new Card();
        instance.deckCreation();
        assertTrue(((instance.cards.length <= 53) && (instance.cards.length >= 0)) && ((instance.decksize <= 53) && (instance.decksize >= 0)));
    }
    
    
    
    
    
}
