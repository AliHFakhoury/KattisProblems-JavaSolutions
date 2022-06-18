// https://open.kattis.com/problems/hissingmicrophone

import java.util.Scanner;

public class hiss {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        boolean bool = false;
        
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                if(s.charAt(i) == 's'){
                    bool = true;    
                }
            }
        }
        
        if(bool){
            System.out.print("hiss");
        }else{
            System.out.print("no hiss");
        }
    }

}