import java.util.Scanner;

public class Avanzado7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero de equipos: ");
        int equipos = sc.nextInt();

        System.out.print("Introduce equipos de la UEFA: ");
        int uefa = sc.nextInt();

        System.out.print("Introduce equipos de la AFC: ");
        int afc = sc.nextInt();

        System.out.print("Introduce equipos de la CAF: ");
        int caf = sc.nextInt();

        System.out.print("Introduce equipos de la CONCAF: ");
        int concaf = sc.nextInt();

        System.out.print("Introduce equipos de la CONMEBOL: ");
        int conmebol = sc.nextInt();

        System.out.print("Introduce equipos de la OFC: ");
        int ofc = sc.nextInt();

        System.out.print("Total de plazas disponibles: ");

        int plazasTotales = sc.nextInt();

        equipos = uefa + afc + caf + concaf + conmebol + ofc;
        int plazasRepesca = equipos - plazasTotales;

        System.out.println("Las plazas de repesca son: " + plazasRepesca);










    }









}