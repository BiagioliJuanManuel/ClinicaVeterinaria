package entidades;


import java.time.LocalDate;

public class Visita {

    private Mascota mascota;

    private Tratamiento tratamiento;

    private LocalDate fechaVisita;
    
    private double pesoActual;
    
    private double pesoPromedio;

    private int idVisita;
    
    private boolean estado;

    public Visita() {
    }

    public Visita(Mascota mascota, Tratamiento tratamiento, LocalDate fechaVisita, double pesoActual, double pesoPromedio, int idVisita, boolean estado) {
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.fechaVisita = fechaVisita;
        this.pesoActual = pesoActual;
        this.pesoPromedio = pesoPromedio;
        this.idVisita = idVisita;
        this.estado = estado;
    }

   
    public Mascota getMascota() {
	return mascota;
    }

    public void setMascota(Mascota mascota) {
	this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
	return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
	this.tratamiento = tratamiento;
    }

    public LocalDate getFechaVisita() {
	return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
	this.fechaVisita = fechaVisita;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    
    
    public int getIdVisita() {
	return idVisita;
    }

    public void setIdVisita(int idVisita) {
	this.idVisita = idVisita;
    }

    public boolean isEstado() {
	return estado;
    }

    public void setEstado(boolean estado) {
	this.estado = estado;
    }

    @Override
    public String toString() {
	return "Visita{" + "mascota=" + mascota + ", tratamiento=" + tratamiento + ", fechaVisita=" + fechaVisita + ", idVisita=" + idVisita + '}';
    }

    
    
 
}
