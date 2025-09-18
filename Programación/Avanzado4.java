import java.util.Scanner;

public class Avanzado4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        double formula = b * b - 4 * a * c;

        double raiz1 = (-b + Math.sqrt(formula)) / (2 * a);
        double raiz2 = (-b - Math.sqrt(formula)) / (2 * a);

        System.out.println("Raíz 1 = " + raiz1);
        System.out.println("Raíz 2 = " + raiz2);

        
    }
}


    
    
    
    
    
    
    
    
    








