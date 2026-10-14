package servicio;

public class MainServicio {
    static void main() {
        Servicio servicio1 = new Servicio();

        servicio1.setNombre("Servidor web");
        servicio1.setPuerto(8080);

        servicio1.mostrarInformacion();

        servicio1.iniciar();

        servicio1.registrarPeticion();
        servicio1.registrarPeticion();
        servicio1.registrarPeticion();

        servicio1.mostrarInformacion();

        servicio1.detener();

        servicio1.registrarPeticion();

        servicio1.mostrarInformacion();
    }
}
