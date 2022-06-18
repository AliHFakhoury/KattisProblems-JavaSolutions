// https://open.kattis.com/problems/lektira

import java.util.Scanner;

public class Lektira {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        
        String word = scan.next();
        String firstPart;
        String secondPart;
        String thirdPart;
        
        String minimized = "~";
        String toCheck = "";
        for(int i = 1; i < word.length(); i++){
            for(int j = i+1; j < word.length(); j++){
                firstPart = word.substring(0, i);
                secondPart = word.substring(i,j);
                thirdPart = word.substring(j,word.length());
                
                buffer.append(firstPart);
                firstPart = buffer.reverse().toString();
                buffer.setLength(0);
                
                buffer.append(secondPart);
                secondPart = buffer.reverse().toString();
                buffer.setLength(0);
                
                buffer.append(thirdPart);
                thirdPart = buffer.reverse().toString();
                buffer.setLength(0);
                
                toCheck = firstPart.concat(secondPart).concat(thirdPart);
                
                if(toCheck.compareTo(minimized) < 0){
                    minimized = toCheck;
                }
            }
        }
        
        System.out.println(minimized);
        
    }
}