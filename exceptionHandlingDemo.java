package revisit;

import java.util.Scanner;

public class exceptionHandlingDemo {    
         
    public static String verifier(String name) throws Exception {
        if (!name.toUpperCase().equals("KIRA"))
            throw new Exception("Imposter!!");
         
        return "Welcome Kira!";
    }
    
    public static void main(String[] args) {
            
        System.out.println("Identify yourself by inserting your name");
        Scanner input = new Scanner(System.in);
        String s = input.next();
        
        try {
            String result = verifier(s);
        	//String result = "test";
            System.out.println("Access Granted!.. " + result); 
        } catch(Exception ex) {
            System.out.println("Unauthorized access!!!"); 
        } finally {
            input.close(); 
        }
    }
}
