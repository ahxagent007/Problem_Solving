//package codeforces_hungrystudent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        
        for(int i=0; i<n; i++){
            int t = kb.nextInt();            
            
            if(t == 0){
                System.out.println("NO");
            }else if(t < 0){
                System.out.println("NO");
            }else if(t%10 == 0){
                System.out.println("YES");
            }else if(t%3 == 0){
                System.out.println("YES");
            }else if(t%7 == 0){
                System.out.println("YES");
            }else if((t%3)%7 == 0){
                System.out.println("YES");
            }else if((t%7)%3 == 0){
                System.out.println("YES");
            }else{
                int chunk = 0;
                int flag = 0;
                for(int j=1;j <= 14;j++){
                    for(int k=1;k<=33;k++){
                        chunk = (j*7+k*3);
                        if(chunk == t){
                            flag = 1;
                            break;
                        }
                    }
                }
                if(flag == 0){
                    System.out.println("NO");
                }else System.out.println("YES");
            }
        }
    }
    
}
