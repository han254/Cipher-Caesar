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
        System.out.println("This is Your encrypted text>>"+Encoding.encrypte( plainText, cipherKey ));
    }
}
