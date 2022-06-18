// https://open.kattis.com/problems/whatdoesthefoxsay

import java.util.ArrayList;
import java.util.Scanner;

public class WhatDoesTheFoxSay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int testCases = scan.nextInt();
        scan.nextLine();

        while(testCases > 0){
            ArrayList<String> strings = new ArrayList<String>();
            testCases--;
            
            String animals = scan.nextLine();

            String[] animalsArray = animals.split(" ");
            
            for(int i = 0; i < animalsArray.length; i++){
                strings.add(animalsArray[i]);
            }
            
            String animalSound = scan.nextLine();
            
            while(!animalSound.equals("what does the fox say?")){
                String[] animalSoundArray = animalSound.split(" ");
                
                boolean foundGoes = false;
                
                for(int i = 0; i < animalSoundArray.length; i++){
                    if(!foundGoes){
                        if(animalSoundArray[i].equals("goes")){
                            foundGoes = true;
                        }
                    }else{
                        while(strings.contains(animalSoundArray[i])){
                            strings.remove(animalSoundArray[i]);                            
                        }
                    }
                }
                
                animalSound = scan.nextLine();
            }
            
            for(int i = 0; i < strings.size(); i++){
                System.out.print(strings.get(i)+" ");
            }
            
        }
    }

}