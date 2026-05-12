package modelo;

public class campanas {

    private int id;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String estado;
    private int PERSONAS_id;

    public campanas() {
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.fecha_inicio = "";
        this.fecha_fin = "";
        this.estado = "";
        this.PERSONAS_id = 0;
    }

    public campanas(int id, String nombre, String descripcion, String fecha_inicio, String fecha_fin, String estado, int PERSONAS_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
        this.PERSONAS_id = PERSONAS_id;
    }

    public int getId() {
        return id; 
    }
    public void setId(int id) {
        this.id = id; 
    }

    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public String getDescripcion() {
        return descripcion; 
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion; 
    }

    public String getFecha_inicio() {
        return fecha_inicio; 
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio; 
    }

    public String getFecha_fin() {
        return fecha_fin; 
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin; 
    }

    public String getEstado() {
        return estado; 
    }
    public void setEstado(String estado) {
        this.estado = estado; 
    }

    public int getPERSONAS_id() {
        return PERSONAS_id; 
    }
    public void setPERSONAS_id(int PERSONAS_id) { this.PERSONAS_id = PERSONAS_id; }

    @Override
    public String toString() {
        return "Campana{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + ", estado=" + estado + ", PERSONAS_id=" + PERSONAS_id + '}';
    }
}