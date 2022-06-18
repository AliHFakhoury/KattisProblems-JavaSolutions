// https://open.kattis.com/problems/simonsays

import java.util.Scanner;

public class SimonSays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        scan.nextLine();
        for(int i = 0; i < n; i++){
            String sentence = scan.nextLine();
            String[] words = sentence.split(" ");
            
            if(words[0].equals("Simon") && words[1].equals("says")){
                for(int j = 2; j < words.length; j++){
                    System.out.print(words[j] + " ");
                }
            }
        }
    }

}