// https://open.kattis.com/problems/secretmessage

import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        
        while(testCases > 0){
            testCases--;
            
            String word = scan.next();
            
            int length = word.length();
            
            double squareRootOfLength = Math.sqrt(length);
            
            if(squareRootOfLength == Math.round(squareRootOfLength)){
                char[][] matrix = new char[(int) squareRootOfLength][(int) squareRootOfLength];

                int counter = 0;
                
                for(int i = 0; i < squareRootOfLength; i++){
                    for(int j = 0; j < squareRootOfLength; j++){
                        matrix[i][j] = word.charAt(counter);
                        counter++;
                    }
                }
                
                for(int i = 0; i < (int) squareRootOfLength; i++){
                    for(int j = (int) squareRootOfLength-1; j >= 0; j--){
                        System.out.print(matrix[j][i]);
                    }
                }
                
                System.out.println();
            }else{
                int newRoot = (int) Math.ceil(squareRootOfLength);
                int newLength = newRoot*newRoot;

                int numAsterisk = newLength - length;
                
                StringBuffer string = new StringBuffer();
                string.append(word);
                for(int i = 0; i < numAsterisk; i++){
                    string.append("*");
                }
                
                char[][] matrix = new char[newRoot][newRoot];
                
                int counter = 0;
                
                for(int i = 0; i < newRoot; i++){
                    for(int j = 0; j < newRoot; j++){
                        matrix[i][j] = string.charAt(counter);
                        counter++;
                    }
                }

                for(int i = 0; i < (int) squareRootOfLength+1; i++){
                    for(int j = (int) squareRootOfLength; j >= 0; j--){
                        if(matrix[j][i] != '*'){
                            System.out.print(matrix[j][i]);
                        }
                    }
                }
                
                System.out.println();
                string.setLength(0);
            }
        }
        
        
    }

}

