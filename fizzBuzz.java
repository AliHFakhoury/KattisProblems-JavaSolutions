// https://open.kattis.com/problems/fizzbuzz

import java.util.Scanner;

public class FuzzBuzz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        for(int i = 1; i <= c; i++){
            if(i%a == 0){
                System.out.print("Fizz");
            }
            
            if(i%b == 0){
                System.out.print("Buzz");
            }
            
            if(i%a != 0 && i%b != 0){
                System.out.print(i);
            }
            System.out.println();
            
        }
    }

}