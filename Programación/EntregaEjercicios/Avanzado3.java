import java.util.Scanner;

public class Avanzado3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de niñas: ");
        int niñas = sc.nextInt();
        System.out.println("Introduce el numero de niños: ");
        int niños = sc.nextInt();

        int total = niños + niñas;

        double porcentajeNiñas = (niñas * 100) / total;
        double porcentajeNiños = (niños * 100) / total;

        System.out.println("Porcentaje de niñas" + porcentajeNiñas + "%");
        System.out.println("Porcentaje de niños" + porcentajeNiños + "%");






    }
















}