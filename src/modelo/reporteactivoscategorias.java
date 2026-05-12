package modelo;

public class reporteactivoscategorias {

    private int id;
    private String nombre;
    private String tipo;
    private String marca;
    private String modelo;
    private String ano_adquisicion;
    private double valor_comercial;
    private String estado;
    private String categoria;

    public reporteactivoscategorias() {
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

    public String getAno_adquisicion() {
        return ano_adquisicion;
    }

    public void setAno_adquisicion(String ano_adquisicion) {
        this.ano_adquisicion = ano_adquisicion;
    }

    public double getValor_comercial() {
        return valor_comercial;
    }

    public void setValor_comercial(double valor_comercial) {
        this.valor_comercial = valor_comercial;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ReporteActivosCategorias{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", ano_adquisicion=" + ano_adquisicion + ", valor_comercial=" + valor_comercial + ", estado=" + estado + ", categoria=" + categoria + '}';
    }
}
