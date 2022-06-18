// https://open.kattis.com/problems/reverserot

import java.util.Scanner;

public class ReverseRot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        
        int shiftAmount = scan.nextInt();
        
        char[] characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','.'};
        while(shiftAmount != 0){
            String string = scan.next();
            
            for(int i = 0; i < string.length(); i++){
                char character = string.charAt(i);
                int position;
                
                if(character == '_'){
                    position = 26;
                }else if(character == '.'){
                    position = 27;
                }else{
                    position = Math.abs('A' - character);
                }
                
                position = (position + shiftAmount)%(characters.length);

                stringBuffer.append(characters[position]);
            }
            
            System.out.println(stringBuffer.reverse());
            stringBuffer.setLength(0);
            
            shiftAmount = scan.nextInt();
        }
    }
}