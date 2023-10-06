package entidades;

public class Tratamiento {
    
    private int idTratamiento;

    private int codigoTratamiento;

    private String tipo;

    private String descripcion;

    private Double importe;

    private boolean estado;

    public Tratamiento() {
    }

    public Tratamiento(int codigoTratamiento, String tipo, String descripcion, Double importe, boolean estado) {
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }     

    public Tratamiento(int idTratamiento, int codigoTratamiento, String tipo, String descripcion, Double importe, boolean estado) {
        this.idTratamiento = idTratamiento;
        this.codigoTratamiento = codigoTratamiento;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.importe = importe;
        this.estado = estado;
    }

        
    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }
    
    
    
    public int getCodigoTratamiento() {
        return codigoTratamiento;
    }

    public void setCodigoTratamiento(int codigoTratamiento) {
        this.codigoTratamiento = codigoTratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
	return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", codigoTratamiento=" + codigoTratamiento + ", tipo=" + tipo + ", descripcion=" + descripcion + ", importe=" + importe + ", estado=" + estado + '}';
    }

    

    
}
