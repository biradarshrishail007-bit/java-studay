import java.util.Scanner; // 1. Crucial Import Statement

public class Parse {
    public static void main(String[] args) {
        // 2. Initialize the Scanner object mapped to console input
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter your value here: ");
        String text_int = sc.nextLine();
        
        int integers = Integer.parseInt(text_int);
        System.out.print("This is my converted value: " + integers);
        
        sc.close(); 
    }
}
