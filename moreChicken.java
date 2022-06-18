// https://open.kattis.com/problems/onechicken

import java.util.Scanner;

public class MoreChicken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numPeople = scan.nextInt();
        int chicken = scan.nextInt();
        
        if(numPeople > chicken){
            int numChicken = numPeople - chicken;
            
            if(numChicken == 1){
                System.out.println("Dr. Chaz needs "+numChicken+" more piece of chicken!");
            }else{
                System.out.println("Dr. Chaz needs "+numChicken+" more pieces of chicken!");
            }
        
        }else if(chicken > numPeople){
            int numChicken = chicken-numPeople;
            
            if(numChicken == 1){
                System.out.println("Dr. Chaz will have "+numChicken+" piece of chicken left over!");
            }else{
                System.out.println("Dr. Chaz will have "+numChicken+" pieces of chicken left over!");
            }
        }
    }

}