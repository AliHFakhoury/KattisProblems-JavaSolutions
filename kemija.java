//https://open.kattis.com/problems/kemija08

import java.util.Scanner;

public class Kemija {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String string = scan.nextLine();
        
        char[] vowels = {'a','e','o','i','u'};
        
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(string.charAt(i) == vowels[j]){
                    i = i + 2;
                    break;
                }
            }
            System.out.print(string.charAt(i));
        }
    }

}