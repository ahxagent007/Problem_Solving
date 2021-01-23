//package hit.the.lottery;

import java.util.Scanner;

public class HitTheLottery {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int bilsArrs[] = {100,20,10,5,1};
        
        int n = kb.nextInt();
        
        int res = 0;
        
        int bils = 0;
        
        for(int i=0;i<5;i++){
            res = n%bilsArrs[i];
            int vagFol = (int)(n / bilsArrs[i]);
            
            if(vagFol<1){
                
            }else{
                bils+=vagFol;
                n = res;
            }        
        }
        
        System.out.println(bils);
        
        
    }
    
}
