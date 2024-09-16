import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        String nombre = "Sarah Connor";
        String tipoDeCuenta = "Caja de ahorro";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("**************************************");
        System.out.println("¡BIENVENID@ AL BANCO SKYNET!");
        System.out.println("**************************************");
        System.out.println("\nNombre de cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: " + saldo);
        System.out.println("\n**************************************");

        String menu = """
                     ** Escriba el número de la opción deseada: **\n
                     1 - Consultar saldo
                     2 - Retirar
                     3 - Depositar
                     9 - Salir
                     """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: $ " + saldo + "\n");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente\n");
                    } else {
                        saldo -= valorARetirar;
                        System.out.println("El saldo actualizado es: $ " + saldo + "\n");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: $ " + saldo + "\n");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios. \n¡Hasta la vista, Baby!");
                    break;
                default:
                    System.out.println("Opción no válida\n");
                    break;
            }
        }

    }
}