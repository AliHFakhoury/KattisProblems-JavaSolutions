// https://open.kattis.com/problems/acm

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ACM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> contest = new HashMap<String, Integer>();
        HashMap<String, String> questionCheck = new HashMap<String, String>();
        HashMap<String, Integer> counter = new HashMap<String, Integer>();

        String answer = scan.nextLine();

        while(!answer.equals("-1")) {
            
            String[] answerArray = answer.split(" ");
            
            int minutes = Integer.valueOf(answerArray[0]);
            String question = answerArray[1];
            String correction = answerArray[2];
            
            if(contest.containsKey(question)) {
                contest.put(question, minutes);
                questionCheck.put(question, correction);
                counter.put(question, counter.get(question) + 1);
            }else {
                contest.put(question, minutes);
                questionCheck.put(question, correction);
                counter.put(question, 0);
            }
            
            answer = scan.nextLine();
        }   
        
        Set<String> keys = contest.keySet();
        String[] keysArray = new String[keys.size()];
        keys.toArray(keysArray);
        
        int totalScore = 0;
        int counterRight = 0;
        
        for(int i = 0; i < keysArray.length; i++) {
            if(questionCheck.get(keysArray[i]).equals("right")){
                totalScore += contest.get(keysArray[i]) + 20*counter.get(keysArray[i]);
                counterRight++;
            }
        }
        
        System.out.println(counterRight + " " + totalScore);
    }
}