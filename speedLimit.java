// https://open.kattis.com/problems/speedlimit

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int n = scan.nextInt();
        
        while( n != -1){
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            
            
            for(int i = 0; i < n; i++){
                array1[i] = scan.nextInt();
                array2[i] = scan.nextInt();
            }
            
            int mile = 0;
            int number;

            for(int i = 0; i < n; i++){
                if(i > 0){
                    number = array2[i] - array2[i-1];
                }else{
                    number = array2[i];
                }
                
                mile += array1[i] * number;
            }
            
            System.out.println(mile + " miles");
            
            mile = 0;
            
            n = scan.nextInt();
        }
    }

}