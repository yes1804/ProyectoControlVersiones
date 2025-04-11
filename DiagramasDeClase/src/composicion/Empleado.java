package composicion;

import java.util.*;

public class Empleado extends Persona{
	private int codempleado;
	private Date fecha_alta;
	private double salario;
	
	//constructor
	public Empleado(String nombre, Date fechanac, String tlfn, int codempleado, Date fecha_alta, double salario) {
		super(nombre, fechanac, tlfn);
		this.codempleado = codempleado;
		this.fecha_alta = fecha_alta;
		this.salario = salario;
	}

	//getters y setters
	public int getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(int codempleado) {
		this.codempleado = codempleado;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//metodo asignar
	public void asignar(String nom, Date fecha, String tel, int codem, Date fechaalta, double sal) {
		super.asignar(nom, fecha, tel);
		this.codempleado = codem;
		this.fecha_alta = fechaalta;
		this.salario = sal;
	}
	
	//metodo Obtener
	public Empleado obtener() {
			return this;
	}
}
