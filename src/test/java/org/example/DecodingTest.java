package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    Decoding plainText = null;


    @Test
    public void decrypteFullStatement() {
        String message ="UIF RVJDL CSPXO GPY KVNQT PWFS UIF MBAZ EPH";
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LA@Y DOG",plainText.decrypte(message,1));
    }
}