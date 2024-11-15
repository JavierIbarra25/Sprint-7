import java.util.Scanner;
public class Sprint7 {
    public static void main(String[] array){
        Scanner input = new Scanner(System.in);

        System.out.println("Introde un número del 1 al 20: ");
        int numero = leerEnteroValido (input);

        int [] multiplos = new int [100];

        for(int i = 1; i < multiplos.length; i++){
            multiplos[i]*= numero;
        }
        System.out.println("Los múltiplos de " + numero+ " del 0 al " + multiplos.length+ " son: "+multiplos[i]);

    }

    public static int leerEnteroValido(Scanner input) {
        boolean NoEsValido = true;
        int numero = 0;
        while (NoEsValido) {
            if (input.hasNextInt()) { // Verificar si es un entero
                numero = input.nextInt();
                if (numero >= 1 && numero <= 20) {
                    NoEsValido = false;
                } else {
                    System.out.println("Error: El número debe estar entre 1 y 20.");
                }
            } else {
                System.out.println("Error: Introduzca un número entero válido.");
                input.next(); // Sustituir la entrada no válida
            }
        }
        return numero;
    }

}
