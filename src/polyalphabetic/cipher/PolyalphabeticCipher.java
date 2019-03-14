/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polyalphabetic.cipher;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PolyalphabeticCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text : ");
        String str = sc.nextLine();
        str = str.toUpperCase();
        char[][] keys = {
            {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'P', 'O', 'I', 'U', 'Y', 'T', 'R', 'E', 'W', 'Q', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'},
            {'Q', 'A', 'Z', 'W', 'S', 'X', 'E', 'D', 'C', 'R', 'F', 'V', 'T', 'G', 'B', 'Y', 'H', 'N', 'U', 'P', 'J', 'M', 'I', 'K', 'O', 'L'},
            {'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'K', 'I', 'O', 'P', 'L', 'U', 'J', 'H', 'Y', 'T', 'G', 'F', 'R', 'E', 'D', 'S', 'W', 'Q', 'A'}
        };
        StringBuffer encryptedStr = new StringBuffer();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = keys[j][(int) str.charAt(i) - 65];
            encryptedStr.append(ch);
            j++;
            j = j % keys.length;
        }
        System.out.println("Encrypted Text : " + encryptedStr);
    }

}
