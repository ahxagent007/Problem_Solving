//package codeforces_radio.station;

import java.util.Scanner;

public class CodeForces_RadioStation {
    

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int m = kb.nextInt();
        
        String nName[] = new String[n];
        String nIP[] = new String[n];
        String cName[] = new String[m];
        String cIP[] = new String[m];

        for(int i=0;i<n;i++){
            nName[i] = kb.next();
            nIP[i] = kb.next();
        }
        
        for(int i=0;i<m;i++){
            cName[i] = kb.next();
            cIP[i] = kb.next();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                String x = cIP[j].substring(0, cIP[j].length()-1);
                if(nIP[i].equals(x)){
                    cIP[j] += " #"+nName[i];
                }
            }
        }
        
        for(int i=0;i<m;i++){
            System.out.println(cName[i]+" "+cIP[i]);
        }
        
        
    }
    
}

/*
2 2 main 192.168.0.2 replica 192.168.0.1 block 192.168.0.1; proxy 192.168.0.2;

*/
