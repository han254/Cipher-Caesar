package org.example;

public class Decoding {
    private String cipherText;
    private int shift;

    public Decoding(String cipherText, int shift) {
        this.cipherText = cipherText;
        this.shift = shift;
}
    public static String encrypte(String decrypte) {
        return decrypte;
    }
    public static int encrypte(int decrypte) {
        return decrypte;
    }
    public static String decrypte(String encrypte) {

        return encrypte;
    }
    public String getCipherText(){
        return this.cipherText;
    }

    public int getShift(){
        return this.shift;
    }
    public static String decrypting(String cipherText , int shift){
        String dMessage = "";
        for(int i=0; i < cipherText.length();i++)

        {
            char alphabet = cipherText.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {

                alphabet = (char) (alphabet - shift);

                if(alphabet < 'a') {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                dMessage = dMessage + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - shift);

                if (alphabet < 'A') {

                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                dMessage = dMessage + alphabet;
            }
            else
            {
                dMessage = dMessage + alphabet;
            }
        }
        return dMessage;
    }
}
