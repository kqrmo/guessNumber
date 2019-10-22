/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author karmo.tutk
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int guessNumber = rand.nextInt(100); // Suvaliselt genereeritav number
        int tries = 0;                        // Arvatud numbrite muutuja

        Scanner input = new Scanner(System.in); 
        int guess;
        boolean over = false;

        System.out.println("Selles mängis pead sa ära arvama numbri vahemikus 1 - 100");
        while (over == false) { // Niikaua, kuni over on false, siis mäng käib.
            System.out.println("Sisesta number, mis sa arvad see võib olla: ");
            guess = input.nextInt();
            tries++;

            if (guess == guessNumber) {
                over = true; // Kui number on ära arvatud, siis paneme over muutuja 'true'-ks
            } else if (guess < guessNumber) { // Kui number on liiga väike
                System.out.println("Sinu sisestatud number on liiga väike. Proovi uuesti!");
            } else if (guess > guessNumber) { // Kui number on liiga suur
                System.out.println("Sinu sisestatud number on liiga suur. Proovi uuesti!");
            }
        } // Mängu käimise loopi lõpp
        
        // KUI MÄNG ON LÄBI
        System.out.println("==================");
        System.out.println("Mäng on läbi!");
        System.out.println("Number, mida arvama pidid oli " + guessNumber);
        System.out.println("See võttis sinul " + tries + " proovi!");
    }
}
