//https://open.kattis.com/problems/bijele

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int king = scan.nextInt();
        int queen = scan.nextInt();
        int rooks = scan.nextInt();
        int bishops = scan.nextInt();
        int knights = scan.nextInt();
        int pawns = scan.nextInt();
        
        System.out.print(1-king);
        System.out.print(' ');
        System.out.print(1-queen);
        System.out.print(' ');
        System.out.print(2-rooks);
        System.out.print(' ');
        System.out.print(2-bishops);
        System.out.print(' ');
        System.out.print(2-knights);
        System.out.print(' ');
        System.out.print(8-pawns);
    }
}