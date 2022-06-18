// https://open.kattis.com/problems/numbertree

import java.util.Scanner;

public class NumberTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        
        String[] inputArray = input.split(" ");
        
        long height = Integer.valueOf(inputArray[0]);
        
        long numOfNodes = 0;
        
        for(int i = 0; i <= height; i++){
            numOfNodes += Math.pow(2, i);
        }
        
        if(inputArray.length == 1){
            System.out.println(numOfNodes);
            return;
        }
        
        char[] position = inputArray[1].toCharArray();
        
        long lowest = numOfNodes;
        long highest = numOfNodes;

        for(int i = 0; i < position.length; i++){
            lowest = (long) (lowest + (-2*Math.pow(2, i)));
            highest = (long) (highest + (-Math.pow(2, i)));
        }
        
        for(int i = 0; i < position.length; i++){
            if(position[i] == 'R'){
                highest = (highest+lowest)/2;
            }else if(position[i] == 'L'){
                lowest = (highest+lowest)/2;
            }
        }
        
        System.out.println(highest);
    }
}