package Ejercicios;

import java.util.Scanner;

public class tienda_ropa {
    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        // 1. Solicite el valor total de la compra.
        System.out.print("Ingrese el valor total de la compra: ");
        double total = scanner.nextDouble();
        scanner.nextLine();

        // 2. Pregunte cuántos productos compró.
        System.out.print("¿Cuántos productos compró? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        // 3. Pregunte si el cliente tiene membresía (sí/no).
        System.out.print("¿Tiene membresía? (si/no): ");
        String membresia = scanner.nextLine().toLowerCase();

        // 4. Calcule el total aplicando los descuentos correspondientes.
        double descuento = 0;

        // Descuento por cantidad
        if (cantidad >= 3) {
            descuento = descuento + (total * 0.05);
        }

        // Descuento por membresía
        if (membresia.equals("si")) {
            descuento = descuento + (total * 0.10);
        }

        double totalFinal = total - descuento;

        // 5. Muestre el total final a pagar.
        System.out.println("\n--- Total ---");
        System.out.println("Total final a pagar: $" + totalFinal);
    }
}
