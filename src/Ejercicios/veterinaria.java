package Ejercicios;
import java.util.Scanner;

public class veterinaria {
    public void ejecutar() {

        Scanner scanner = new Scanner(System.in);

        //1. Pregunte el tipo de animal (perro, gato, ave, otro).
        System.out.print("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipoAnimal = scanner.nextLine().toLowerCase();

        // 2. Pregunte la edad del animal.
        System.out.println("Escriba la edad del animal: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        // 3. Según el tipo de animal, determine qué veterinario le corresponde:
        // • perro  veterinario canino
        // • gato  veterinario felino
        // • ave  veterinario de animales exóticos
        // • otro  veterinario general
        String veterinario = "";

        switch (tipoAnimal) {
            case "perro":
                veterinario = "veterinario canino";
                break;
            case "gato":
                veterinario = "veterinario felino";
                break;
            case "ave":
                veterinario = "veterinario de animales exóticos";
                break;
            default:
                veterinario = "veterinario general";
                break;
        }

        //4. Indique si se recomienda vacunación adicional (solo perros y gatos mayores de 5 años).
        String recomendacion = ""; // <- faltaba esta variable

        if ((tipoAnimal.equals("perro") || tipoAnimal.equals("gato")) && edad > 5) {
            recomendacion = "Se recomienda vacunación adicional por ser mayor de 5 años.";
        }

        // 5. Muestre el veterinario asignado y la recomendación (si aplica).
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Veterinario asignado: " + veterinario);

        if (recomendacion.equals("")) {
            System.out.println("No hay recomendaciones adicionales.");
        } else {
            System.out.println("Recomendación: " + recomendacion);
        }
    }
}
