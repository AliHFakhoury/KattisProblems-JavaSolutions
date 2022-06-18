// https://open.kattis.com/problems/mirror

import java.util.Scanner;

public class MirrorImages {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        int numTests = scan.nextInt();
        
        int rowOfCases;
        int columnOfCases;
        
        for(int i = 0; i < numTests; i++){
            rowOfCases = scan.nextInt();
            columnOfCases = scan.nextInt();
            char[][] caseNumbers = new char[rowOfCases][columnOfCases];
            
            String caseCharacters = scan.nextLine();
            for(int j = 0; j < rowOfCases; j++){
                caseCharacters = scan.nextLine();
                for(int k = 0; k < columnOfCases; k++){
                    caseNumbers[j][k] = caseCharacters.charAt(k);
                }
            }
            
            System.out.println("Test " + (i+1));
            for(int p = rowOfCases-1; p >= 0; p--){
                for(int q = columnOfCases-1; q >= 0; q--){
                    System.out.print(caseNumbers[p][q]);
                }
                System.out.println();
            }
        }
    }

}

