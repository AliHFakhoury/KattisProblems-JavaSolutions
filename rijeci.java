// https://open.kattis.com/problems/rijeci

import java.util.Scanner;

public class Rijeci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int button = scan.nextInt();
        
        if(button == 0){
            System.out.print("1 0");
            return;
        }else if(button == 1){
            System.out.print("0 1");
            return;
        }
        
        int[][] counter = new int[button+1][2];
    
        counter[0][0] = 1;
        counter[0][1] = 0;
        
        counter[1][0] = 0;
        counter[1][1] = 1;
        
        int i;
        
        for(i = 2; i <= button; i++){
            counter[i][0] = counter[i-1][0]+counter[i-2][0];
            counter[i][1] = counter[i-1][1]+counter[i-2][1];
        }
        
        System.out.print(counter[i-1][0] + " " + counter[i-1][1]);
    }

}