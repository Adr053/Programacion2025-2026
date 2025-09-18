import java.util.Scanner;

public class Avanzado5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Introduce el numero de insectos: ");
        int insectos = sc.nextInt();
        System.out.print("Introduce el numero de aracnidos: ");
        int aracnidos = sc.nextInt();
        System.out.print("Introduce el numero de crustaceos: ");
        int crustaceos = sc.nextInt();
        System.out.print("Introduce el numero de miriapodos: ");
        int miriapodos = sc.nextInt();

        //Formula para calcular el numero total de patas
        int formula = insectos + aracnidos + crustaceos + miriapodos;

        System.out.println("El numero de patas totales es: " + formula);

    
    
    
    
    
    
    }









}