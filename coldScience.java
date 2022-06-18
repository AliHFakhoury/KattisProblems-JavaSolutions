// https://open.kattis.com/problems/cold

import java.util.Scanner;

public class ColdScience {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(scan.nextInt() < 0){
                count++;
            }
        }
        
        System.out.println(count);
    }

}