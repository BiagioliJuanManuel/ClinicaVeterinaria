package entidades;


import java.util.List;

public class Cliente {

    private String nombre;

    private int documento;

    private String direccion;

    private String telefono;

    private String contactoAlternativo;

    private List<Mascota> mascotas;

    private boolean estado;

    private int idCliente;

    public Cliente() {
    }

    public Cliente(String nombre, int documento, String direccion, String telefono, String contactoAlternativo, boolean estado) {
	this.nombre = nombre;
	this.documento = documento;
	this.direccion = direccion;
	this.telefono = telefono;
	this.contactoAlternativo = contactoAlternativo;
	this.estado = estado;
    }

    public Cliente(String nombre, int documento, String direccion, String telefono, String contactoAlternativo, boolean estado, int idCliente) {
	this.nombre = nombre;
	this.documento = documento;
	this.direccion = direccion;
	this.telefono = telefono;
	this.contactoAlternativo = contactoAlternativo;
	this.estado = estado;
	this.idCliente = idCliente;
    }
    

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public int getDocumento() {
	return documento;
    }

    public void setDocumento(int documento) {
	this.documento = documento;
    }

    public String getDireccion() {
	return direccion;
    }

    public void setDireccion(String direccion) {
	this.direccion = direccion;
    }

    public String getTelefono() {
	return telefono;
    }

    public void setTelefono(String telefono) {
	this.telefono = telefono;
    }

    public String getContactoAlternativo() {
	return contactoAlternativo;
    }

    public void setContactoAlternativo(String contactoAlternativo) {
	this.contactoAlternativo = contactoAlternativo;
    }

    public List<Mascota> getMascotas() {
	return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
	this.mascotas = mascotas;
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
	return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + ", direccion=" + direccion + ", telefono=" + telefono + ", contactoAlternativo=" + contactoAlternativo + ", mascotas=" + mascotas + ", estado=" + estado + ", idCliente=" + idCliente + '}';
    }

  
}
