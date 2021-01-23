//package codeforces_run.pkgfor.your.prize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeForces_RunForYourPrize {

    public static void main(String[] args) {       
        Scanner kb = new Scanner(System.in);
        int myPos = 1;
        int friendPos = 1000000;
        int n = kb.nextInt();
        
        //int arr[] = new int[n];
        int minArray[] =new int [n];
        List<Integer> min = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            int t = kb.nextInt();
            min.add(minTime(t,myPos,friendPos));
            //minArray[i] = minTime(t,myPos,friendPos);         
        }
        //Arrays.sort(arr);
        System.out.println(Collections.max(min));
        
        
    }
    
    static int minTime(int prize, int m, int f){
    
        int c1 = Integer.min(prize-m,f-prize);
       
        return c1;
    }
    
}
