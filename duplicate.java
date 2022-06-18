// https://open.kattis.com/problems/apaxiaaans

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
            
        System.out.print(name.replaceAll("(.)\\1{1,}", "$1"));
    }

}