import java.util.Scanner;

public class Aplicacion {

   public void ejecutar(Menu menu) {



       Scanner scanner = new Scanner(System.in);


       int opcionElegida= menu.seleccion(scanner);

       switch (opcionElegida) {
           case 1:
               System.out.println("Saldo: $ " + menu.saldo);

               break;

           case 2:
               System.out.println("¿Cuanto desea retirar?.");
               double retiro = scanner.nextDouble();
               System.out.println(retiro);
               if (retiro <= menu.saldo) {
                   System.out.println("RETIRANDO $" + retiro);
                   menu.saldo -= retiro;
                   System.out.println("saldo: $" + menu.saldo);

               } else {
                   System.out.println("Saldo Insuficiente");
               }
               break;

           case 3:

               System.out.println("Cantidad a depositar: $ .");
               double depositar = scanner.nextDouble();
               menu.saldo += depositar;
               System.out.println("Nuevo saldo disponible $" + menu.saldo);
               break;
           case 4:
               System.out.println("SALIR");
               System.exit(0);
               break;
           default:
               System.out.println("Opción no válida. Por favor elige un número entre 1 y 4.");


       }

       ejecutar(menu);

   }











}
