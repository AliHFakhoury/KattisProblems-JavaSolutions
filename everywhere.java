//https://open.kattis.com/problems/everywhere

import java.util.Scanner;
import java.util.Arrays;

public class Everywhere {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            int counter = 0;
            String[] string = new String[a];
            
            String city = scan.nextLine();
            for(int j = 0; j < a; j++){
                city = scan.nextLine();
                
                if(!Arrays.asList(string).contains(city)){
                    counter++;
                }
                
                string[j] = city;
            }
            
            System.out.println(counter);
        }
    }

}