package proyecto;

public class MainProyecto {
    static void main() {
        Proyecto proyecto1 = new Proyecto();

        proyecto1.setNombre("Sistema de ventas");
        proyecto1.setResponsable("Ana");

        proyecto1.mostrarInformacionInicial();

        proyecto1.avanzar(30);
        proyecto1.avanzar(20);

        proyecto1.avanzar(60);

        proyecto1.mostrarInformacionFinal();
    }
}
