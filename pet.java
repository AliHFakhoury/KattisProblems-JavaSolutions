// https://open.kattis.com/problems/pet

import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int winner = 1;
        int grade;
        int winnerGrade = 0;
        
        for(int i = 0; i < 5; i++){
            sum = 0;
            
            for(int j = 0; j < 4; j++){
                grade = scan.nextInt();
                sum += grade;
            }
            
            if(i == 0){
                winner = 1;
                winnerGrade = sum;
            }else{
                if(winnerGrade < sum){
                    winner = (i+1);
                    winnerGrade = sum;
                }
            }
        }
        
        System.out.print(winner + " " + winnerGrade);
    }

}