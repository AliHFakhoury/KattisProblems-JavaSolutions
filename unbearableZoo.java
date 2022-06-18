// https://open.kattis.com/problems/zoo

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class UnbearableZoo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> animals = new HashMap<>();
        TreeSet<String> animalSet = new TreeSet();
        
        int testCases = scan.nextInt();
        scan.nextLine();

        int counter = 1;
        
        while(testCases != 0){
            for(int i = 0; i < testCases; i++){
                String caseAnimal = scan.nextLine();
                
                String[] caseAnimalArray = caseAnimal.split(" ");
                
                caseAnimal = caseAnimalArray[caseAnimalArray.length-1].toLowerCase();
                animalSet.add(caseAnimal);
                
                if(animals.containsKey(caseAnimal)){
                    int value = animals.get(caseAnimal) + 1;
                    animals.remove(caseAnimal);
                    animals.put(caseAnimal, value);
                }else{
                    animals.put(caseAnimal, 1);
                }
            }
            
            System.out.print("List "+(counter++)+":\n");

            String[] arrayOfAnimalNames = animalSet.toArray(new String[animalSet.size()]);

            for(int i = 0; i < arrayOfAnimalNames.length; i++){
                System.out.println(arrayOfAnimalNames[i]+" | "+animals.get(arrayOfAnimalNames[i]));
            }
            
            animals.clear();
            animalSet.clear();
            testCases = scan.nextInt();
            scan.nextLine();

        }

    }

}