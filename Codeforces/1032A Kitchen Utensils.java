import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int k = kb.nextInt();
        
        int arr[] = new int[101];
        int c = 0;
        
        for(int i=0;i<n;i++){
            int a = kb.nextInt();
            arr[a]++;
            if(arr[a]>c){
                c = arr[a];
            }
        }
        
        int maxPerDish = (int) (k * (Math.ceil((double)c/(double)k)));
        
        int missing = 0;
        
        for(int i=0;i<101;i++){
            if(arr[i] != 0){
                missing += maxPerDish - arr[i];
            }
        }
        
        System.out.println(missing);
    }
    
}
