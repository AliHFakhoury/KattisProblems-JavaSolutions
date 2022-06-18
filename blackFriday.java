// https://open.kattis.com/problems/blackfriday

import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] dieCount = new int[6];
        int currentPerson;

        int numTimes = scan.nextInt();
        int[] positions = new int[numTimes];

        for(int i = 0; i < numTimes; i++){
            currentPerson = scan.nextInt();
            
            positions[i] = currentPerson;
            dieCount[currentPerson-1]++;
        }
        
        for(int i = 5; i >= 0; i--){
            if(dieCount[i] == 1){
                for(int j = 0; j < numTimes; j++){
                    if(positions[j] == (i+1)){
                        System.out.println(j+1);
                        return;
                    }
                }
            }
        }
        
        System.out.print("none");
        
    }
}