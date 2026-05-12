package modelo;

public class categorias {

    private int id;
    private String nombre;
    private int dias_prestamo;
    private double porcentaje_penalizacion;

    public categorias() {
        this.id = 0;
        this.nombre = "";
        this.dias_prestamo = 0;
        this.porcentaje_penalizacion = 0.0;
    }

    public categorias(int id, String nombre, int dias_prestamo, double porcentaje_penalizacion) {
        this.id = id;
        this.nombre = nombre;
        this.dias_prestamo = dias_prestamo;
        this.porcentaje_penalizacion = porcentaje_penalizacion;
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

    public int getDias_prestamo() {
        return dias_prestamo; 
    }
    public void setDias_prestamo(int dias_prestamo) {
        this.dias_prestamo = dias_prestamo; 
    }

    public double getPorcentaje_penalizacion() {
        return porcentaje_penalizacion; 
    }
    public void setPorcentaje_penalizacion(double porcentaje_penalizacion) {
        this.porcentaje_penalizacion = porcentaje_penalizacion; 
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre + ", dias_prestamo=" + dias_prestamo + ", porcentaje_penalizacion=" + porcentaje_penalizacion + '}';
    }
}