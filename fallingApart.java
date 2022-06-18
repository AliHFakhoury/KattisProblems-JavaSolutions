// https://open.kattis.com/problems/fallingapart

import java.util.Scanner;
import java.util.Arrays;

public class Cycles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] numbers = new int[n];
        
        int sum1 = 0;
        int sum2 = 0;
                
        for(int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        
        Arrays.sort(numbers);
        int counter = 0;
        
        for(int i = n-1; i >= 0; i--){
            if(counter%2 == 0){
                sum1 = sum1 + numbers[i];
            }else{
                sum2 = sum2 + numbers[i];
            }
            
            counter++;
        }
        
        System.out.print(sum1);
        System.out.print(" ");
        System.out.print(sum2);
    }

}