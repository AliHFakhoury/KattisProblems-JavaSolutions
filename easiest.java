// https://open.kattis.com/problems/easiest

import java.util.Scanner;

public class Easiest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m;
        
        int multiple = 1;
        int length;
        int sum;
        
        while(n != 0){
            length = String.valueOf(n).length();
            sum = 0;
            m = n;
            
            for(int j = 1; j <= length; j++){
                sum += m%10;
                m = m / 10;
            }
            boolean bool = true;
            for(int i = 11; bool; i++){
                multiple = i*n;
                int length2 = String.valueOf(multiple).length();
                int sum2 = 0;
                
                for(int k = 1; k <= length2; k++){
                    sum2 += multiple%10;
                    multiple = multiple/10;
                }
                
                if(sum == sum2){
                    System.out.println(i);
                    bool = false;
                }
                
        
            }
            
            n = scan.nextInt();
            
            
        }
    }

}