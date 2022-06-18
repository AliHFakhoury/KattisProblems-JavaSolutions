// https://open.kattis.com/problems/encodedmessage

import java.util.Scanner;

public class EncodedMessage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        String message;
        int length;
        int size;
        
        message = scan.nextLine();
        for(int i = 0; i < n; i++){
            message = scan.nextLine();
            length = message.length();
            size = (int) Math.sqrt(length);
            
            char[][] array = new char[size][size];
            int p = 0;
            
            for(int j = 0; j < size; j++){
                for(int k = size - 1; k >= 0; k--){
                    array[k][j] = message.charAt(p);
                    p++;
                }
            }
            
            for(int j = 0; j < size; j++){
                for(int k = 0; k < size; k++){
                    System.out.print(array[j][k]);
                }
            }
            
            System.out.println();
        }
        
    }

}