// https://open.kattis.com/problems/numberfun

import java.util.Scanner;

public class NumberFun {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int a;
        int b;
        int c;
        
        for(int i = 0; i < n; i++){
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            
            if(1.0*a/b == c || a*b == c || a+b == c || a-b == c || 1.0*b/a == c || b-a == c ){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }

}