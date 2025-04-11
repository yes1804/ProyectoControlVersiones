package composicion;

import java.util.*;

public class Director extends Empleado {
	private String categoria;
	private Date fechadirector;

	//constructor
	public Director(String nombre, Date fechanac, String tlfn, int codempleado, Date fecha_alta, double salario,
			String categoria, Date fechadirector) {
		super(nombre, fechanac, tlfn, codempleado, fecha_alta, salario);
		this.categoria = categoria;
		this.fechadirector = fechadirector;
	}

	//getters and setters
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getFechadirector() {
		return fechadirector;
	}

	public void setFechadirector(Date fechadirector) {
		this.fechadirector = fechadirector;
	}


	public void asignar(String nom, Date fecha, String tel, int codem, Date fechaalta, double sal, String cat, Date fech) {
		super.asignar(nom, fecha, tel, codem, fechaalta, sal);
		this.categoria = cat;
		this.fechadirector = fech;
	}

	
}
