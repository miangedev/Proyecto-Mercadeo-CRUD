package modelo;

public class reservasactivosclientes {

    private int id;
    private String fecha_reserva;
    private String estado;
    private int ACTIVOS_id;
    private int PERSONAS_id;

    public reservasactivosclientes() {
        this.id = 0;
        this.fecha_reserva = "";
        this.estado = "";
        this.ACTIVOS_id = 0;
        this.PERSONAS_id = 0;
    }

    public reservasactivosclientes(int id, String fecha_reserva, String estado, int ACTIVOS_id, int PERSONAS_id) {
        this.id = id;
        this.fecha_reserva = fecha_reserva;
        this.estado = estado;
        this.ACTIVOS_id = ACTIVOS_id;
        this.PERSONAS_id = PERSONAS_id;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getFecha_reserva() { 
        return fecha_reserva; 
    }
    public void setFecha_reserva(String fecha_reserva) { 
        this.fecha_reserva = fecha_reserva; 
    }

    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }

    public int getACTIVOS_id() { 
        return ACTIVOS_id; 
    }
    public void setACTIVOS_id(int ACTIVOS_id) { 
        this.ACTIVOS_id = ACTIVOS_id; 
    }

    public int getPERSONAS_id() { 
        return PERSONAS_id; 
    }
    public void setPERSONAS_id(int PERSONAS_id) { 
        this.PERSONAS_id = PERSONAS_id; 
    }

    @Override
    public String toString() {
        return "ReservasActivosClientes{" + "id=" + id + ", fecha_reserva=" + fecha_reserva + ", estado=" + estado + ", ACTIVOS_id=" + ACTIVOS_id + ", PERSONAS_id=" + PERSONAS_id + '}';
    }
}