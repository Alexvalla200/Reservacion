import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = sc.nextLine();


        System.out.println("Ingrese el número de días de la estadía:");
        int numeroDias = sc.nextInt();
        sc.nextLine();


        System.out.println("Ingrese el tipo de habitación (individual(1), doble(2), suite(3)):");
        String tipoHabitacion = sc.nextLine();


        Reserva reserva = new Reserva(nombreCliente, numeroDias, tipoHabitacion);

        reserva.mostrarReserva();

        System.out.println("¿Desea actualizar el estado de la reserva? (si/no):");
        String actualizar = sc.nextLine();
        if (actualizar.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nuevo estado de la reserva (Confirmada/Cancelada):");
            String nuevoEstado = sc.nextLine();
            reserva.setEstadoReserva(nuevoEstado);

            reserva.mostrarReserva();
        }

        sc.close();
    }
}

