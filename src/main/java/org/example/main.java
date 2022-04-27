package org.example;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Your plaintext message>> ");
        String plainText = sc.nextLine();
        System.out.println("Enter Your specific key>>");
        // scanning the next token of the input as an Int.
        int cipherKey = sc.nextInt();
        String encryptedMessage=Encoding.encrypte(plainText, cipherKey);
        System.out.println("This is Your encrypted text>>"+ encryptedMessage);

        System.out.println("Here is the decrypted text>>"+ Decoding.decrypte(encryptedMessage,cipherKey));
    }
}
