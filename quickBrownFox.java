// https://open.kattis.com/problems/quickbrownfox

import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfSentences = scan.nextInt();
        
        scan.nextLine();
        
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i = 0; i < numberOfSentences; i++){
            boolean pangram = true;
            String sentence = scan.nextLine();
            boolean[] alphabetBoolean = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};

            for(int j = 0; j < sentence.length(); j++){
                char currentLetter = Character.toLowerCase(sentence.charAt(j));
                int letterPosition = Math.abs('a' - currentLetter);
                
                if(letterPosition <= 25){
                    if(alphabet[letterPosition] == currentLetter){
                        alphabetBoolean[letterPosition] = true;
                    }
                }
                
            }
            
            for(int k = 0; k < alphabet.length; k++){
                if(alphabetBoolean[k] == false){
                    pangram = false;
                    break;
                }
            }
            
            if(!pangram){
                System.out.print("missing ");
                for(int k = 0; k < alphabet.length; k++){
                    if(alphabetBoolean[k] == false){
                        System.out.print(alphabet[k]);
                    }
                }
                System.out.println();
            }else{
                System.out.println("pangram");
            }
        }
    }
}