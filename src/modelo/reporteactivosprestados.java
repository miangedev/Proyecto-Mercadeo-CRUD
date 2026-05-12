package modelo;

public class reporteactivosprestados {

    private int prestamo_id;
    private String persona;
    private String activo;
    private String tipo;
    private String marca;
    private String modelo;
    private String fecha_inicio;
    private String fecha_fin_programa;
    private String estado;
    private int pagada;

    public reporteactivosprestados() {
    }

    public int getPrestamo_id() {
        return prestamo_id;
    }

    public void setPrestamo_id(int prestamo_id) {
        this.prestamo_id = prestamo_id;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin_programa() {
        return fecha_fin_programa;
    }

    public void setFecha_fin_programa(String fecha_fin_programa) {
        this.fecha_fin_programa = fecha_fin_programa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPagada() {
        return pagada;
    }

    public void setPagada(int pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "ReporteActivosPrestados{" + "prestamo_id=" + prestamo_id + ", persona=" + persona + ", activo=" + activo + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", fecha_inicio=" + fecha_inicio + ", fecha_fin_programa=" + fecha_fin_programa + ", estado=" + estado + ", pagada=" + pagada + '}';
    }
}
