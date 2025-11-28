import java.util.Scanner;
import Ejercicios.supermercado;
import Ejercicios.veterinaria;
import Ejercicios.parqueadero;
import Ejercicios.tienda_ropa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- Bienvenido al Laboratorio de Control Flow --");
            System.out.println("\n--Elije una opción para ver el ejercicio---");
            System.out.println("1. Supermercado");
            System.out.println("2. Veterinaria");
            System.out.println("3. Parqueadero");
            System.out.println("4. Tienda de ropa");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> new supermercado().ejecutar();
                case 2 -> new veterinaria().ejecutar();
                case 3 -> new parqueadero().ejecutar();
                case 4 -> new tienda_ropa().ejecutar();
                case 0 -> System.out.println("Saliendo del menú...");
                default -> System.out.println("Opción incorrecta. Por favor intente nuevamente.");
            }

        } while (opcion != 0);
    }
}