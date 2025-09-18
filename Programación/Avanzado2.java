import java.util.Scanner;

public class Avanzado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Introduce la altura en centímetros: ");
        double alturaCm = sc.nextDouble();

        
        double altura = alturaCm / 100.0;

        
        double imc = peso / (altura * altura);

        System.out.printf("Tu IMC es: %.2f\n", imc);

        
    }
}


    
    
    







