package modelo;

public class penalizacionprestamos {

    private int id;
    private int dias_retraso;
    private double valor_penali;
    private String fecha_generacion;
    private int pagada;
    private int PRESTAMOS_ACTIVO_PERSONA_id;

    public penalizacionprestamos() {
        this.id = 0;
        this.dias_retraso = 0;
        this.valor_penali = 0.0;
        this.fecha_generacion = "";
        this.pagada = 0;
        this.PRESTAMOS_ACTIVO_PERSONA_id = 0;
    }

    public penalizacionprestamos(int id, int dias_retraso, double valor_penali, String fecha_generacion, int pagada, int PRESTAMOS_ACTIVO_PERSONA_id) {
        this.id = id;
        this.dias_retraso = dias_retraso;
        this.valor_penali = valor_penali;
        this.fecha_generacion = fecha_generacion;
        this.pagada = pagada;
        this.PRESTAMOS_ACTIVO_PERSONA_id = PRESTAMOS_ACTIVO_PERSONA_id;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
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

    public int getPagada() { return pagada; }
    public void setPagada(int pagada) { 
        this.pagada = pagada; 
    }

    public int getPRESTAMOS_ACTIVO_PERSONA_id() { 
        return PRESTAMOS_ACTIVO_PERSONA_id; 
    }
    public void setPRESTAMOS_ACTIVO_PERSONA_id(int PRESTAMOS_ACTIVO_PERSONA_id) { 
        this.PRESTAMOS_ACTIVO_PERSONA_id = PRESTAMOS_ACTIVO_PERSONA_id; 
    }

    @Override
    public String toString() {
        return "PenalizacionPrestamos{" + "id=" + id + ", dias_retraso=" + dias_retraso + ", valor_penali=" + valor_penali + ", fecha_generacion=" + fecha_generacion + ", pagada=" + pagada + ", PRESTAMOS_ACTIVO_PERSONA_id=" + PRESTAMOS_ACTIVO_PERSONA_id + '}';
    }
}