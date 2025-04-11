package asociacion;

import java.util.*;

public class Departamento {
	private int codigo;
	private String nombre;
	private String localidad;
	private Set<Empleado> empleados;

	// Constructor con Parametros
	public Departamento(int codigo, String nombre, String localidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.localidad = localidad;
		this.empleados = new HashSet<>();
	}

//Getters y Setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}
	
	//metodo añadir empleado
	public void añadirEmpleado(Empleado emp) {
		empleados.add(emp);
	}

	//Metodo toString
	@Override
	public String toString() {
	    String resultado= "Departamento: \nCodigo: " + codigo 
	                     + "\nNombre: " + nombre 
	                     + "\nLocalidad: " + localidad 
	                     + "\nEmpleados asignados: ";
	    
	    // Si hay empleados asignados, mostramos sus nombres
	    if (!empleados.isEmpty()) {
	        for (Empleado empleado : empleados) {
	            resultado += "\n - " + empleado.getNombre();
	        }
	    } else {
	        resultado += "No hay empleados asignados.";
	    }
	    System.out.println();
	    return resultado;
	}

}
