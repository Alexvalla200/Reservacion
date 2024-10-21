public class Reserva {

    private String nombreCliente;
    private int numeroDias;
    private String tipoHabitacion;
    private String estadoReserva;


    public Reserva(String nombreCliente, int numeroDias, String tipoHabitacion) {
        this.nombreCliente = nombreCliente;
        this.numeroDias = numeroDias;
        this.tipoHabitacion = tipoHabitacion;
        this.estadoReserva = "Confirmada";
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public void mostrarReserva() {
        System.out.println(" Información de la Reserva ");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Número de días: " + numeroDias);
        System.out.println("Tipo de habitación: " + tipoHabitacion);
        System.out.println("Estado de la reserva: " + estadoReserva);
    }
}