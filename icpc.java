// https://open.kattis.com/problems/icpcawards

import java.util.Arrays;
import java.util.Scanner;

public class ICPC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        String array[] = new String[n];
        
        String string;
        String first;
        String[] word;      
        
        string = scan.nextLine();
        int j = 0;
        
        for(int i = 0; i < n; i++){
            
            string = scan.nextLine();
            word = string.split(" ");
            
            first = word[0];            
                
            if(!Arrays.asList(array).contains(first)){
                if(j < 12){
                    System.out.println(string);
                    j++;
                }else{
                    break;
                }
            }
            
            array[i] = first;   
        }
        
    }
}