package modelo;

public class prestamosactivopersonas {

    private int id;
    private String fecha_inicio;
    private String fecha_fin_programa;
    private String fecha_entrega_real;
    private String estado;
    private int PERSONAS_id;
    private int ACTIVOS_id;

    public prestamosactivopersonas() {
        this.id = 0;
        this.fecha_inicio = "";
        this.fecha_fin_programa = "";
        this.fecha_entrega_real = "";
        this.estado = "";
        this.PERSONAS_id = 0;
        this.ACTIVOS_id = 0;
    }

    public prestamosactivopersonas(int id, String fecha_inicio, String fecha_fin_programa, String fecha_entrega_real, String estado, int PERSONAS_id, int ACTIVOS_id) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin_programa = fecha_fin_programa;
        this.fecha_entrega_real = fecha_entrega_real;
        this.estado = estado;
        this.PERSONAS_id = PERSONAS_id;
        this.ACTIVOS_id = ACTIVOS_id;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
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

    public String getFecha_entrega_real() { 
        return fecha_entrega_real; 
    }
    public void setFecha_entrega_real(String fecha_entrega_real) { 
        this.fecha_entrega_real = fecha_entrega_real; 
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
    public void setPERSONAS_id(int PERSONAS_id) { 
        this.PERSONAS_id = PERSONAS_id; 
    }

    public int getACTIVOS_id() { return ACTIVOS_id; }
    public void setACTIVOS_id(int ACTIVOS_id) { 
        this.ACTIVOS_id = ACTIVOS_id; 
    }

    @Override
    public String toString() {
        return "PrestamosActivoPersonas{" + "id=" + id + ", fecha_inicio=" + fecha_inicio + ", fecha_fin_programa=" + fecha_fin_programa + ", fecha_entrega_real=" + fecha_entrega_real + ", estado=" + estado + ", PERSONAS_id=" + PERSONAS_id + ", ACTIVOS_id=" + ACTIVOS_id + '}';
    }
}