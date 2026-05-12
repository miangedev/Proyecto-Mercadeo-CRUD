package modelo;

public class rol {

    private int id;
    private String nombre_rol;

    public rol() {
        this.id = 0;
        this.nombre_rol = "";
    }

    public rol(int id, String nombre_rol) {
        this.id = id;
        this.nombre_rol = nombre_rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public void setRol(String NombreRol) {
        this.nombre_rol = NombreRol;
    }

    @Override
    public String toString() {
        return "Id del Rol{" + "id=" + id + ", Nombre del Rol=" + nombre_rol + '}';
    }
}