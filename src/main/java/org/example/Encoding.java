package org.example;

public class Encoding {
    private String plainText;
    private int cipherKey;

    public Encoding(String plainText, int cipherKey){
        this.plainText =plainText;
        this.cipherKey =cipherKey;
    }
}public String getPlainText(){
    return this.plainText;
}

