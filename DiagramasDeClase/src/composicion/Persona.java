package composicion;

import java.util.*;
public class Persona {
	private String nombre;
	private Date fechanac;
	private String tlfn;

//constuctor
	public Persona(String nombre, Date fechanac, String tlfn) {
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.tlfn = tlfn;
	}

//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}
	
	// metodo asignar
	public void asignar(String nom, Date fecha, String tel) {
		this.nombre = nom;
		this.fechanac = fecha;
		this.tlfn = tel;
	}

	// metodo obtener
	public Persona obtener() {
		return this;
	}

}
