// https://open.kattis.com/problems/lineup

import java.util.Scanner;

public class LineUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        String[] names = new String[n];
        
        for(int i = 0; i < names.length; i++){
            names[i] = scan.next();
        }
        
        boolean increasing = false;
        boolean decreasing = false;
        boolean neither = false;
        
        if(names[0].compareTo(names[1]) < 0){
            increasing = true;
        }else{
            decreasing = true;
        }
        
        for(int i = 1; i < names.length-1; i++){
            if(increasing){
                if(names[i].compareTo(names[i+1]) > 0){
                    neither = true;
                    increasing = false;
                    break;
                }
            }else if(decreasing){
                if(names[i].compareTo(names[i+1]) < 0){
                    neither = true;
                    decreasing = false;
                    break;
                }
            }
        }
        
        if(increasing){
            System.out.println("INCREASING");
        }else if(decreasing){
            System.out.println("DECREASING");
        }else{
            System.out.println("NEITHER");
        }
    }
}

