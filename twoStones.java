// https://open.kattis.com/problems/twostones

import java.util.Scanner;

public class TwoStones {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int stones = scan.nextInt();
        
        if(stones%2 == 0){
            System.out.print("Bob");
        }else{
            System.out.print("Alice");
        }
    }
}