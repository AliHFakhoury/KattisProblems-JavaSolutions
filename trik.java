// https://open.kattis.com/problems/trik

import java.util.Scanner;

public class Trik {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        int position = 1;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' && position == 1){
                position = 2;
            }else if(s.charAt(i) == 'A' && position == 2){
                position = 1;
            }
            
            if(s.charAt(i) == 'B' && position == 2){
                position = 3;
            }else if(s.charAt(i) == 'B' && position == 3){
                position = 2;
            }
            
            if(s.charAt(i) == 'C' && position == 3){
                position = 1;
            }else if(s.charAt(i) == 'C' && position == 1){
                position = 3;
            }
        }
        
        System.out.println(position);
        
    }

}