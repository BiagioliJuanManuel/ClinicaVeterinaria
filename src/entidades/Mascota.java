package entidades;


import java.sql.Date;
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
    
//    Date fechaNac = java.sql.Date.valueOf(fechaNacimiento);

//    private Double pesoPromedio;

//    private Double pesoActual;

    private List<Visita> historialVisitas;

    private boolean estado;
    
    private int idCliente;

    public Mascota() {
    }

    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNacimiento, boolean estado, int idCliente) {
	this.idMascota = idMascota;
	this.alias = alias;
	this.sexo = sexo;
	this.especie = especie;
	this.raza = raza;
	this.colorPelo = colorPelo;
	this.fechaNacimiento = fechaNacimiento;
	this.estado = estado;
	this.idCliente = idCliente;
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colorPelo, LocalDate fechaNacimiento, boolean estado, int idCliente) {
	this.alias = alias;
	this.sexo = sexo;
	this.especie = especie;
	this.raza = raza;
	this.colorPelo = colorPelo;
	this.fechaNacimiento = fechaNacimiento;
	this.estado = estado;
	this.idCliente = idCliente;
    }


    
    

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    public List<Visita> getHistorialVisitas() {
        return historialVisitas;
    }

    public void setHistorialVisitas(List<Visita> historialVisitas) {
        this.historialVisitas = historialVisitas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

   

    @Override
    public String toString() {
	return "Mascota{" + "idMascota=" + idMascota + ", alias=" + alias + ", sexo=" + sexo + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + ", historialVisitas=" + historialVisitas + ", estado=" + estado + ", idCliente=" + idCliente + '}';
    }
    
    


    
    
}
