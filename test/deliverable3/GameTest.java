/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author lataw
 */
public class GameTest {
    
    
    
    public GameTest() {
        
        
    }

    /**
     * Test of main method, of class Game.
     */
    
    
    
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        
        
        
    }

    /**
     * Test of drawCard method, of class Game.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        int num = 0;
        String expResult = null;
        String result = Game.drawCard(num);
        assertNotEquals(expResult, result);
        System.out.println(result);
    }
    
    
    
    
    
}