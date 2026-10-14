package servicio;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        }
    }
    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getPuerto() {
        return puerto;
    }
    public boolean isActivo() {
        return activo;
    }
    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void iniciar() {
        activo = true;
        System.out.println("Servicio iniciado.");
    }
    public void detener() {
        activo = false;
        System.out.println("Servicio detenido.");
    }
    public void registrarPeticion() {
        if (activo) {
            cantidadPeticiones++;
            System.out.println("Petición registrada.");
        } else {
            System.out.println("Error: el servicio está detenido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("===== INFORMACIÓN DEL SERVICIO =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Puerto: " + puerto);
        if (activo) {
            System.out.println("Estado: Activo");
        } else {
            System.out.println("Estado: Inactivo");
        }
        System.out.println("Cantidad de peticiones: " + cantidadPeticiones);
    }
}
