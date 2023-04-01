
import java.util.Scanner;


public class hipotenus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. dik kenari girin");
        float x = scanner.nextFloat();
        System.out.println("2. dik kenari girin");
        float y = scanner.nextFloat();
        double z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("hipotenus ="+z);
        
        
        
        
    }
    
    
    
    
}
