package Ejercicios;

import java.util.Scanner;

public class supermercado {
    public void ejecutar(){
        Scanner scanner = new Scanner(System.in);

//        1. Solicite el valor total de la compra.
        System.out.print("Ingrese el total de la compra: ");
        double total = scanner.nextDouble();
//        2. Pregunte cuántos productos compró.
        System.out.println("Ingrese la cantidad de productos que compró: ");
        int productos = scanner.nextInt();
        scanner.nextLine();

//        3. Pregunte si el cliente tiene membresía (sí/no).
        System.out.print("¿El cliente tiene membresía? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();

        boolean tieneMembresia =
//        4. Calcule el total aplicando los descuentos correspondientes.

//        5. Muestre el total final a pagar.
    }
}
