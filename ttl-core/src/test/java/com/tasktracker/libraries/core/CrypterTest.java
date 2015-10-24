package com.tasktracker.libraries.core;

import com.tasktracker.libraries.core.security.Crypter;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Created by u6019943 on 08/07/2015.
 */
public class CrypterTest {
    
    private String phrase;
    
    @Before
    public void setUp(){
        this.phrase = "Happy, happy hippo";
    }
    
    @After
    public void tearDown(){
        this.phrase = null;
    }
    
    @Test
    public void crypterTest(){
        Assert.assertEquals(this.phrase, Crypter.decrypt(Crypter.encrypt(this.phrase)));
    }
    
}
