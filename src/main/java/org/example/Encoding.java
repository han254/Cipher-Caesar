package org.example;

import java.util.*;
public class Encoding {
    private String plainText;
    private int cipherKey;

    public Encoding(String plainText, int cipherKey) {
        this.plainText = plainText;
        this.cipherKey= cipherKey;
    }
    public String getPlainText(){
        return this.plainText;
    }

    public int getShift(){
        return this.cipherKey;
    }
    public static String encrypting(String plainText, int cipherKey ){
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plainText.length();i++)
        {
            alphabet = plainText.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet + cipherKey);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + cipherKey);

                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        return ciphertext;
    }
}