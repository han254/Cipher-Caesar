package org.example;

public class Decoding {

    public static String decrypte(String plainText, int cipherKey ){
        String cipherText = "";
        char alphabet;
        for(int i=0; i < plainText.length();i++)
        {
            alphabet = plainText.charAt(i);
            if(Character.isLowerCase(alphabet)){
                if(alphabet >= 'a' && alphabet <= 'z')
                {
                    alphabet = (char) (alphabet - cipherKey);
                    if(alphabet > 'z') {
                        alphabet = (char) (alphabet+'a'-'z'-1);
                    }
                    cipherText= cipherText + alphabet;
                }
            }
          else if(Character.isUpperCase(alphabet)){
               if(alphabet >= 'A' && alphabet <= 'Z') {
                    alphabet = (char) (alphabet - cipherKey);

                    if(alphabet > 'Z') {
                        alphabet = (char) (alphabet +'A'-'Z'-1);
                    }
                    cipherText = cipherText + alphabet;
                }
            }
            else {
                cipherText = cipherText + alphabet;
            }

        }
        return cipherText;
    }
}
