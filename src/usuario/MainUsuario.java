package usuario;

public class MainUsuario {
    static void main() {
        Usuario usuario1 = new Usuario();

        usuario1.setUsername("ana123");
        usuario1.setCorreo("ana@gmail.com");
        usuario1.setNivel(1);

        usuario1.activar();
        usuario1.mostrarInformacion();

        usuario1.desactivar();

        System.out.println("Activo: " + usuario1.isActivo());
    }
}
