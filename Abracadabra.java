// https://open.kattis.com/problems/timeloop

import java.util.Scanner;

public class Abracadabra {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int numbers = scan.nextInt();
        
        for(int i = 1; i <= numbers; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}