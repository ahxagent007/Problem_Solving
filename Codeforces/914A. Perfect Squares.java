import java.util.Scanner;
import java.lang.Math;

public class Codeforces_PerfectSquares {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int max = Integer.MIN_VALUE;        
        for(int i=0;i<n;i++){
            int x = kb.nextInt();
            
            if(x>max){
                if(!(Math.pow(x,0.5) == Math.round(Math.pow(x, 0.5)))){
                    max = x;
                }
            }            
        }
        System.out.println(max);
       
    }
    
}
