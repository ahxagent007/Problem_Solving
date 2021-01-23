//package codeforces_findextraone;
import java.util.Scanner;

public class Codeforces_findExtraOne {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        int pX=0,nX=0;
        
        for(int i=0;i<n;i++){
            int x = kb.nextInt();
            int y = kb.nextInt();
            if(x > 0){
                pX++;
            }else{
                nX++;
            }
        }
        if(pX <=1 || nX<=1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
