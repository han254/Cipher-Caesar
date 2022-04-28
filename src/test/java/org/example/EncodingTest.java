package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {
    Encoding plainText = null;

    @Test
    public void textLowercase(){
        String text ="peter";
        assertEquals("qfufs",plainText.encrypte(text,1));
    }
    @Test
    public void textUppercase(){
        String message ="BABY";
        assertEquals("DCDA",plainText.encrypte(message,2));
    }
    @Test
    public void encrypteFullStatement(){
        String message ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", plainText.encrypte(message,23));
    }
}