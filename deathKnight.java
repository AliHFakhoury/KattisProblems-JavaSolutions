// https://open.kattis.com/problems/deathknight

import java.util.Scanner;

public class DeathKnight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int n = scan.nextInt();
        int counter = 0;
        
        boolean won = true;
        
        
        String string = scan.nextLine();
        for(int j = 0; j < n; j++){
            won = true;
            string = scan.nextLine();
            
            for(int i = 1; i < string.length(); i++){
                if(string.charAt(i) == 'D' && string.charAt(i-1) == 'C'){
                    won = false;
                }
            }
            
            if(won){
                counter++;
            }
        }
        
        System.out.println(counter);
    }

}