import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int R1 = scan.nextInt();
        int S = scan.nextInt();
        
        System.out.print(2*S - R1);
    }
}