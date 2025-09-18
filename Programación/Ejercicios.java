import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Ej1
        
        int x = 13;
        int y = 5;
        int suma = x + y;
        int resta = x - y;
        double producto = x * y;
        double division = x / y;
        int resto = x % y;
        
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(producto);
        System.out.println(division);
        System.out.println(resto);


        //Ej2

        final double PI = 3.141592;
        
        System.out.println("Introduce el radio:");
        double radio = sc.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = sc.nextDouble();
        double volumen = PI * radio * radio * altura;

        System.out.printf("radio: %.2f cm%n", radio);
        System.out.printf("altura: %.2f cm%n", altura);
        System.out.printf("El volumen del cilindro es %3.4f" + volumen);


        //Ej3

        


    }








}