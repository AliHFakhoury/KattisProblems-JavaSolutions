// https://open.kattis.com/problems/nineknights

import java.util.Scanner;

public class NineKnights {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char[][] board = new char[5][5];
        
        String line;
        int counter = 0;
        for(int i = 0; i < 5; i++){
            line = scan.nextLine();
            
            for(int j = 0; j < 5; j++){
                board[i][j] = line.charAt(j);
                
                if(line.charAt(j) == 'k'){
                    counter++;
                }
            }
        }
        
        boolean valid = true;
        
        if(counter != 9){
            System.out.print("invalid");
        }else{

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(board[i][j] == 'k'){
                        if(hitsKnight(i,j,board)){
                            valid = false;
                            break;
                        }
                    }
                    
                    if(!valid){
                        break;
                    }
                }
                if(!valid){
                    break;
                }
            }
            
            if(valid){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            

        }
                
    }
    
    /*
     *    1) x-2/y-1   2) x-2/y+1
     *    3) x-1/y-2   4) x+1/y-2
     *    5) x+2/y-1   6) x+2/y+1
     *    7) x-1/y+2   8) x+1/y+2
     * 
     */
    
    public static boolean hitsKnight(int x, int y, char[][] board){
        if(x-2 >= 0 && y-1 >= 0){
            if(board[x-2][y-1] == 'k'){
                return true;
            }
        }
        
        if(x-2 >= 0 && y+1 <= 4){
            if(board[x-2][y+1] == 'k'){
                return true;
            }
        }
        
        if(x-1 >= 0 && y-2 >= 0){
            if(board[x-1][y-2] == 'k'){
                return true;
            }
        }
        
        if(x+1 <= 4 && y-2 >= 0){
            if(board[x+1][y-2] == 'k'){
                return true;
            }
        }
        
        if(x+2 <= 4 && y-1 >= 0){
            if(board[x+2][y-1] == 'k'){
                return true;
            }
        }
        
        if(x+2 <= 4 && y+1 <= 4){
            if(board[x+2][y+1] == 'k'){
                return true;
            }
        }
        
        if(x-1 >= 0 && y+2 <= 4){
            if(board[x-1][y+2] == 'k'){
                return true;
            }
        }
        
        if(x+1 <= 4 && y+2 <= 4){
            if(board[x+1][y+2] == 'k'){
                return true;
            }
        }
        
        return false;
    }

}