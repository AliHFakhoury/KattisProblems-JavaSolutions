// https://open.kattis.com/problems/reversebinary

import java.util.Scanner;

public class ReverseBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        String binary = Integer.toBinaryString(a);
        
        char[] binaryArray = binary.toCharArray();
        
        String reversed = "";
        
        for(int i = binaryArray.length-1; i >= 0; i--){
            reversed += binaryArray[i];
        }
        
        int reversedBinary = Integer.parseInt(reversed, 2);
        
        System.out.println(reversedBinary);
        
    }

}