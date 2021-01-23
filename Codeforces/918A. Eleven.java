//package codeforces_eleven.fibonacci;

import java.util.Scanner;

public class CodeForces_ElevenFibonacci {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        char name[] = new char[n];
        
        for(int i=0;i<n;i++){
            name[i] = 'o';
        }
        int i=1;
        while(fuck(i+1)<=n){
            //System.out.println("i = "+i+" fuck = "+fuck(i+1));
            name[fuck(i+1)-1] = 'O';
            i++;
        }
        
        System.out.println(name);
        
    }
    
    static int fuck(int n){
        double a = 1 + Math.pow(5.0, 0.5);
        double b = 1 - Math.pow(5.0, 0.5);
        double x = Math.pow(a, (double)n) - Math.pow(b, (double)n);
        double y = Math.pow(2.0, (double)n) * Math.pow(5.0, 0.5);
        return (int)(x/y);
    }
    
}
