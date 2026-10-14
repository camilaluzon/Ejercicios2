package proyecto;

public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.isBlank()) {
            this.responsable = responsable;
        }
    }
    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;

            if (progreso == 100) {
                terminado = true;
            } else {
                terminado = false;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getProgreso() {
        return progreso;
    }
    public String getResponsable() {
        return responsable;
    }
    public boolean isTerminado() {
        return terminado;
    }

    public void mostrarInformacionInicial(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Responsable: " + getResponsable());
        System.out.println("Progreso inicial: " + getProgreso());
    }
    public void mostrarInformacionFinal(){
        System.out.println("Progreso final: " + getProgreso());
        System.out.println("¿Terminado?: " + isTerminado());
    }
    public void avanzar(int porcentaje) {
        if (porcentaje > 0 && progreso + porcentaje <= 100) {
            progreso = progreso + porcentaje;
            if (progreso == 100) {
                terminado = true;
            }
            System.out.println("Progreso actualizado: " + progreso + "%");
        }
    }
}
