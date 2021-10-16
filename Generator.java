/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Generator {
    
    
    public static String generateRandomPassword(int laenge)
    {
        //Aplhanum
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+*#%!&";
        
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i< laenge; i++){
            int randomIndex = random.nextInt(chars.length()); 
            sb.append(chars.charAt(randomIndex)); //Werte hinfügen
        }
        return sb.toString();
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wie lang soll das Passwort sein ?");
        int laenge = input.nextInt();
        System.out.println(generateRandomPassword(laenge));
    }
}
