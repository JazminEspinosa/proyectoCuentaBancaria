public class Main {

    public static void main(String[] args) {

        Menu menu=new Menu();


        System.out.println("|* BIENVENIDO A BANCA PATITO *|\n");
        System.out.println("Cliente: " + menu.cliente);
        System.out.println("Tipo de Cuenta: " + menu.tipoCuenta);
        System.out.println("Saldo Disponible:$ " + menu.saldo);

        Aplicacion aplicacion = new Aplicacion();
        aplicacion.ejecutar(menu);


    }
}

