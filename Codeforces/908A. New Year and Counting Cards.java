//package codeforces_newyearandcountingcards;

import java.util.Scanner;

public class Codeforces_newYearAndCountingCards {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        String x = kb.next();
        int dick = 0;
        
        for(int i=0;i<x.length();i++){
            //'a', 'e', 'i', 'o' or 'u','0', '2', '4', '6' or '8'
            if(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u' || 
            x.charAt(i) == '1' || x.charAt(i) == '3' || x.charAt(i) == '5' || x.charAt(i) == '7' || x.charAt(i) == '9'){
            
                dick++;
            }
        }
        System.out.println(""+dick);

    }
    
}
