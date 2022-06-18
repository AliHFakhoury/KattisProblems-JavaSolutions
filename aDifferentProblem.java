// https://open.kattis.com/problems/different

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        long long1;
        long long2;
        
        Scanner scan = new Scanner(System.in);
            
        while(scan.hasNext()){
            
            long1 = scan.nextLong();
            long2 = scan.nextLong();
            
            
            if(long1 > long2){
                System.out.println(long1 - long2);
            }else{
                System.out.println(long2 - long1);
            }
        }       
    }

}

