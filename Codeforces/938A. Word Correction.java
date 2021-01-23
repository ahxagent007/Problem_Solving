//package codeforces_word.correction;

import java.util.Scanner;

public class CodeForces_WordCorrection {


    public static void main(String[] args) {       
        Scanner kb = new Scanner(System.in);
        String res = "";
        int n = kb.nextInt();
        //int flag = 0;
        String word = kb.next();
        
        for(int i=0;i<n;i++){
            if(i==0){
               res+=word.charAt(i);
            }else{
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || 
                    word.charAt(i) == 'u' || word.charAt(i) == 'y'){
                if(word.charAt(i-1) == 'a' || word.charAt(i-1) == 'e' || word.charAt(i-1) == 'i' || word.charAt(i-1) == 'o' || 
                    word.charAt(i-1) == 'u' || word.charAt(i-1) == 'y'){
                        
                    }else{
                        res+=word.charAt(i);
                    }
                }else{
                    res+=word.charAt(i);
                }
            }
            
        }
        System.out.println(res);
        
    }
    
}
