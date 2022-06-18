// https://open.kattis.com/problems/nastyhacks

import java.util.Scanner;

public class Hacks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int tests = scan.nextInt();
        
        int[][] array = new int[tests][3];
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < tests; i++){
                int r = array[i][0];
                int e = array[i][1];
                int c = array[i][2];
                
                int value = r - (e-c);
                
                if(value > 0){
                    System.out.println("do not advertise");
                }else if(value < 0){
                    System.out.println("advertise");
                }else{
                    System.out.println("does not matter");
                }
            
        }
    }

}