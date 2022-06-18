// https://open.kattis.com/problems/aboveaverage

import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        
        while(testCases > 0){
            testCases--;
            
            int numOfStudents = scan.nextInt();
            
            int[] students = new int[numOfStudents];
            
            double totalGrades = 0;
            
            for(int i = 0; i < numOfStudents; i++){
                students[i] = scan.nextInt();
                totalGrades += students[i];
            }
            
            int counter = 0;
            
            double average =((1.0*totalGrades)/numOfStudents);
            for(int i = 0; i < numOfStudents; i++){
                if(students[i] > average){
                    counter++;
                }
            }
            
            double classGrades = ((0.0+counter)/numOfStudents)*100;
            
            DecimalFormat df = new DecimalFormat("#0.000");
            String rounded = df.format(classGrades);
            System.out.println(rounded+"%");
        }
    }

}

