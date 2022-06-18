// https://open.kattis.com/problems/tolower

import java.util.Scanner;

public class ToLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int problems = scan.nextInt();
        int testCases = scan.nextInt();
        
        int counterSolved = 0;
        boolean canSolve = false;

        for(int i = 0; i < problems; i++){
            canSolve = true;
            for(int j = 0; j < testCases; j++){
                String stringCase = scan.next();

                if(canSolve){
                    
                    for(int k = 1; k < stringCase.length(); k++){
                        int character = 'z' - stringCase.charAt(k);

                        if(character > 25){
                            canSolve = false;
                            break;
                        }
                    }
                }
            }
            
            if(canSolve){
                counterSolved++;
            }
        }
        
        System.out.println(counterSolved);
    }
}

