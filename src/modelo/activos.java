package modelo;

public class activos {

    private int id;
    private String nombre;
    private String tipo;
    private String marca;
    private String modelo;
    private String ano_adquisicion;
    private double valor_comercial;
    private String estado;
    private int CATEGORIAS_id;

    public activos() {
        this.id = 0;
        this.nombre = "";
        this.tipo = "";
        this.marca = "";
        this.modelo = "";
        this.ano_adquisicion = "";
        this.valor_comercial = 0.0;
        this.estado = "";
        this.CATEGORIAS_id = 0;
    }

    public activos(int id, String nombre, String tipo, String marca, String modelo, String ano_adquisicion, double valor_comercial, String estado, int CATEGORIAS_id) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano_adquisicion = ano_adquisicion;
        this.valor_comercial = valor_comercial;
        this.estado = estado;
        this.CATEGORIAS_id = CATEGORIAS_id;
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
        return valor_comercial; }
    public void setValor_comercial(double valor_comercial) {
        this.valor_comercial = valor_comercial; 
    }

    public String getEstado() {
        return estado; 
    }
    public void setEstado(String estado) {
        this.estado = estado; 
    }

    public int getCATEGORIAS_id() {
        return CATEGORIAS_id; 
    }
    public void setCATEGORIAS_id(int CATEGORIAS_id) {
        this.CATEGORIAS_id = CATEGORIAS_id; 
    }

    @Override
    public String toString() {
        return "Activo{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", ano_adquisicion=" + ano_adquisicion + ", valor_comercial=" + valor_comercial + ", estado=" + estado + ", CATEGORIAS_id=" + CATEGORIAS_id + '}';
    }
}