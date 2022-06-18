// https://open.kattis.com/problems/oddmanout

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class OddManOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int numGuests;
        
        boolean last = true;
        
        for(int i = 0; i < n; i++){
            numGuests = scan.nextInt();
            BigInteger[] guests = new BigInteger[numGuests];
            
            for(int j = 0; j < numGuests; j++){
                guests[j] = scan.nextBigInteger();
            }

            Arrays.sort(guests);
            
            for(int k = 0; k < guests.length-1; k = k + 2){
                if(!guests[k].equals(guests[k+1])){
                    System.out.println("Case #" + (i+1) + ": "+ guests[k]);
                    last = false;
                    break;
                }
            }
            
            if(last){
                System.out.println("Case #" + (i+1) + ": "+ guests[guests.length-1]);
            }
            
            last = true;
        }   
    }
}