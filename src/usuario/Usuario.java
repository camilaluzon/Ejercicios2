package usuario;

public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void setUsername(String username) {
        if (username != null && !username.isBlank()) {
            this.username = username;
        }
    }
    public void setCorreo(String correo) {
        if (correo != null && !correo.isBlank()) {
            this.correo = correo;
        }
    }
    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public String getUsername() {
        return username;
    }
    public String getCorreo() {
        return correo;
    }
    public int getNivel() {
        return nivel;
    }
    public boolean isActivo() {
        return activo;
    }

    public void mostrarInformacion(){
        System.out.println("Username: " + getUsername());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Activo: " + isActivo());
    }
    public void activar() {
        activo = true;
    }
    public void desactivar() {
        activo = false;
    }
}
