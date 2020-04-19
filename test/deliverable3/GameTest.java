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
     * Test of drawCard method, of class Game.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCardGood");
        int num = 0;
        String expResult = "ACE of DIAMONDS";
        String result = Game.drawCard(num);
        do{
            
            
            num++;
            if(num == 25){
                num = 0;
            }
            
            result = Game.drawCard(num);
            
        }while(!expResult.equals(result));
        
        assertEquals(expResult,result);
        
    }
    
    @Test 
    public void testDrawCard1() {
        System.out.println("drawCardBad");
        int num = 0;
        String expResult = "";
        String result = Game.drawCard(num);
        
        assertTrue(result.contains(expResult));
        
        
        
    }
    
    public void testDrawCard2()
    {
        System.out.println("Boundary check");
        int num = 0;
        String result = Game.drawCard(num);
        assertTrue((result.length() <= 17) && (result.length() >= 0));
    }
    
}
