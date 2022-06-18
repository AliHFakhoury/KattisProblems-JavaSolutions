// https://open.kattis.com/problems/ladder

import java.util.Scanner;

public class ladder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int wall = scan.nextInt();
        int angle = scan.nextInt();
        
        int ladder = (int) (wall/(Math.sin(Math.toRadians(angle))));
        
        System.out.println((int) Math.ceil(ladder+1));
    }

}