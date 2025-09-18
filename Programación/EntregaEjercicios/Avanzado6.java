import java.util.Scanner;

public class Avanzado6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Huevos que caben: ");
        int huevos = sc.nextInt();
        
        System.out.print("Introduce el numero de huevos a cocer: ");
        int cocer = sc.nextInt();
        
        int tandas = (huevos + cocer -1) / cocer;
        

        int tiempo = tandas * 10;

        System.out.println("El tiempo total es: " + tiempo + "minutos");




        
    }









}