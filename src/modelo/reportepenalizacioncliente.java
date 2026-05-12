package modelo;

public class reportepenalizacioncliente {

    private String nombre;
    private String numero_documento;
    private int dias_retraso;
    private double valor_penali;
    private String fecha_generacion;

    public reportepenalizacioncliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public int getDias_retraso() {
        return dias_retraso;
    }

    public void setDias_retraso(int dias_retraso) {
        this.dias_retraso = dias_retraso;
    }

    public double getValor_penali() {
        return valor_penali;
    }

    public void setValor_penali(double valor_penali) {
        this.valor_penali = valor_penali;
    }

    public String getFecha_generacion() {
        return fecha_generacion;
    }

    public void setFecha_generacion(String fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }

    @Override
    public String toString() {
        return "ReportePenalizacionCliente{" + "nombre=" + nombre + ", numero_documento=" + numero_documento + ", dias_retraso=" + dias_retraso + ", valor_penali=" + valor_penali + ", fecha_generacion=" + fecha_generacion + '}';
    }
}
