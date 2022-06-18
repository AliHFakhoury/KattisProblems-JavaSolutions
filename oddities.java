// https://open.kattis.com/problems/oddities

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int test = scan.nextInt();
        int[] array = new int[test];
        
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        
        for(int i = 0; i < test; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i]+" is even");
            }else{
                System.out.println(array[i]+" is odd");
            }
        }
    }
}