package Ejercicios;

import java.util.Scanner;

public class parqueadero {
    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        // 1. Solicite el tipo de vehículo (auto, moto, bicicleta).
        System.out.print("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String tipo = scanner.nextLine().toLowerCase();

        // 2. Pregunte la hora de llegada en formato de 24 horas (0–23).
        System.out.print("Ingrese la hora de llegada (0-23): ");
        int hora = scanner.nextInt();

        if (hora < 0 || hora > 23) {
            System.out.println("Hora no válida. Debe estar entre 0 y 23.");
            return;
        }

        // 3. Asigne un costo base según el vehículo:

        int costo = 0;

        if (tipo.equals("auto")) {
            costo = 5000;
        } else if (tipo.equals("moto")) {
            costo = 3000;
        } else if (tipo.equals("bicicleta")) {
            costo = 1000;
        } else {
            System.out.println("Tipo de vehículo no válido.");
            return;
        }

        // 4. Si la hora es mayor que 20, aplique el recargo del 20%.
        if (hora > 20) {
            int recargo = (int)(costo * 0.20);
            costo = costo + recargo;
        }

        // 5. Muestre el costo total final.
        System.out.println("\n--- Total---");
        System.out.println("Costo total a pagar: $" + costo);
    }
}
