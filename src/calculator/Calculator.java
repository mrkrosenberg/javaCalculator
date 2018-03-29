import java.util.Scanner;

class calc {

    
    public static void main(String[] args) {
        
        //initializes scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Type your first number: "); 
        double num = input.nextDouble();
        
        System.out.println("Type your second number: ");
        double num2 = input.nextDouble();
        
        double answer = num + num2;
        System.out.println("Your answer is " + answer + ".");
        
    }
    
}
