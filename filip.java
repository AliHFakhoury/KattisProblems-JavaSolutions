// https://open.kattis.com/problems/filip

import java.util.Scanner;

public class filip {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String string = scan.nextLine();
        
        String[] numbers = string.split(" ");
        
        String first = "";
        String second = "";
        
        for(int i = 0; i < 3; i++){
            first += numbers[0].charAt(2-i);
            second += numbers[1].charAt(2-i);
        }
        
        int firstInt = Integer.valueOf(first);
        int secondInt = Integer.valueOf(second);
        
        System.out.println(Math.max(firstInt, secondInt));
    }

}