/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author lataw
 */
public class PlayerTest {
    
    String p1;
    
    public PlayerTest() {
        
    }
    
    
   
    @Test
    public void testSetPlayerId() {
        System.out.println("setPlayerId");
        String ID = "100";
        Player instance = new Player();
        instance.setPlayerId(ID);
        System.out.println(instance.getPlayerId());
    }

    /**
     * Test of getPlayerId method, of class Player.
     */
    @Test
    public void testGetPlayerId() {
        System.out.println("getPlayerId");
        Player instance = new Player();
        String expResult = null;
        String result = instance.getPlayerId();
        assertEquals(expResult, result);
    }
    
}
