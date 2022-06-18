// https://open.kattis.com/problems/aaah

import java.util.Scanner;

public class Aah {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String doctor = scan.nextLine();
        String patient = scan.nextLine();
    
        if(doctor.length() - 1 < patient.length() -1){
            System.out.print("no");
        }else{
            System.out.print("go");
        }
    }
}