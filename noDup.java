// https://open.kattis.com/problems/nodup

import java.util.Scanner;

public class NoDup {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String sentence = scan.nextLine();
        
        String[] sentenceArray = sentence.split(" ");
        
        boolean bool = false;
        
        for(int i = 0; i < sentenceArray.length; i++){
            for(int j = 0; j < sentenceArray.length; j++){
                if(i == j){
                    
                }else{
                    if(sentenceArray[i].equals(sentenceArray[j])){
                        bool = true;
                        break;
                    }
                }
            }
            
            if(bool){
                break;
            }
        }
        
        if(bool){
            System.out.print("no");
        }else{
            System.out.print("yes");
        }
    }
}