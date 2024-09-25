import java.util.Scanner;

public class Menu {

    String cliente = "Juanito Perez";
    double saldo = 100;
    String tipoCuenta = "Cuenta Corriente";

    public int seleccion(Scanner scanner) {
        // Aquí va el bloque de código que quieres reutilizar




        System.out.println("\n\n *************************************");
        System.out.println("\n **Escriba el numero de la opcion deseada**");
        System.out.println(" 1  - Consultar Saldo Disponible");
        System.out.println(" 2  - Retirar");
        System.out.println(" 3  - Depositar");
        System.out.println(" 4  - Salir");




        int opcionElegida = scanner.nextInt();
        System.out.println(opcionElegida);
        return opcionElegida;
    }



}
