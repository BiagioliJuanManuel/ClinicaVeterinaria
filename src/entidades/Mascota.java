package entidades;


import java.time.LocalDate;
import java.util.List;

public class Mascota {

    private int idMascota;

    private String alias;

    private String sexo;

    private String especie;

    private String raza;

    private String colorPelo;

    private LocalDate fechaNacimiento;

    private Double pesoPromedio;

    private Double pesoActual;

    private List<Visita> historialVisitas;

    private boolean estado;

    public Mascota() {
    }

    public void setIdMascota(int idMascota) {
    }

    public int getIdMascota() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setAlias(String alias) {
    }

    public String getAlias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSexo(String sexo) {
    }

    public String getSexo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEspecie(String especie) {
    }

    public String getEspecie() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setRaza(String raza) {
    }

    public String getRaza() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setColorPelo(String colorPelo) {
    }

    public String getColorPelo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
    }

    public LocalDate getFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPesoPromedio(Double pesoPromedio) {
    }

    public Double getPesoPromedio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPesoActual(Double pesoActual) {
    }

    public Double getPesoActual() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHistorialVisitas(List<Visita> historialVisitas) {
    }

    public List<Visita> getHistorialVisitas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEstado(boolean estado) {
    }

    public boolean getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
	return "Mascota{" + "idMascota=" + idMascota + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + ", pesoPromedio=" + pesoPromedio + ", pesoActual=" + pesoActual + ", historialVisitas=" + historialVisitas + ", estado=" + estado + '}';
    }
    
    
    
}
