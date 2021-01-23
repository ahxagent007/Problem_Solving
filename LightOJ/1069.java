import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    int k, T, a, b, time;

    T = kb.nextInt();

    k = 0;
    while(k < T){
      a = kb.nextInt();
      b = kb.nextInt();

      if(a > b){
        time = (a - b) * 4 + 3 + 5 + 3 + (a * 4) + 3 + 5;
      }
        else if(a == b){
        time = 3 + 5 + 3 + (a * 4) + 3 + 5;
        }
        else{
         time = (b - a) * 4 + 3 + 5 + 3 + (a * 4) + 3 + 5;
        }
      System.out.printf("Case %d: %d", k+1, time);
      System.out.println();
      k++;
      }
      kb.close();
    }
}
