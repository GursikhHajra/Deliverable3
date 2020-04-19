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
public class PlayerTest {
    
    
    public PlayerTest() {
        
    }
    
    
   /**
     * Test of setPlayerId method, of class Player.
     */
   
    @Test
    public void testSetPlayerId() {
        System.out.println("setPlayerId");
        String ID = "JohnDoe";
        String expResult = "JohnDoe";
        Player instance = new Player();
        instance.setPlayerId(ID);
        assertEquals(expResult,ID);   
    }
    
    @Test
    public void testSetPlayerId1() {
        System.out.println("setPlayerId");
        String ID = null;
        Player instance = new Player();
        instance.setPlayerId(ID);
        
    }
    
    @Test
    public void testSetPlayerId2() {
        System.out.println("setPlayerId");
        String ID = "";
        Player instance = new Player();
        instance.setPlayerId(ID);
        assertTrue((ID.length() <= 9) && (ID.length() >= 0));
    }
    
    

    /**
     * Test of getPlayerId method, of class Player.
     */
    @Test
    public void testGetPlayerId() {
        System.out.println("getPlayerId");
        Player instance = new Player();
        String expResult = "";
        String result = instance.getPlayerId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPlayerId1() {
        System.out.println("getPlayerId");
        Player instance = new Player();
        String expResult = null;
        String result = instance.getPlayerId();
        assertTrue(expResult, result.contains(result));
    }
    
    @Test
    public void testGetPlayerId2() {
        System.out.println("getPlayerId");
        Player instance = new Player();
        String result = instance.getPlayerId();
        assertTrue((result.length() <= 9) && (result.length() >= 0));
    }
    
}
