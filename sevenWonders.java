// https://open.kattis.com/problems/sevenwonders

import java.util.Scanner;

public class SevenWonders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String cards = scan.next();
        
        char[] cardsArray = cards.toCharArray();
        
        boolean[] cardsBoolean = {false,false,false};
        
        int TCounter = 0, CCounter = 0, GCounter = 0, setCounter = 0;
    
        for(int i = 0; i < cardsArray.length; i++) {
            if(cardsArray[i] == 'T') {
                TCounter++;
            }else if(cardsArray[i] == 'C') {
                CCounter++;
            }else if(cardsArray[i] == 'G') {
                GCounter++;
            }
        }
        
        int minimum = TCounter;
        if(CCounter < minimum) {
            minimum = CCounter;
        }
        
        if(GCounter < minimum) {
            minimum = GCounter;
        }
        
        int total = total = (int) (Math.pow(TCounter, 2) + Math.pow(CCounter, 2) + Math.pow(GCounter, 2) + 7*minimum);
        System.out.println(total);
    }
}