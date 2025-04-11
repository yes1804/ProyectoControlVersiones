package composicion;

import java.util.*;

public class Empresa {
	private String cif;
	private String razonsocial;
	private String direccion;
	private String tlfn;
	private Set<Empleado> empleados;
	private Set<Cliente> clientes;

//constructores
	public Empresa(String cif, String razonsocial, String direccion, String tlfn) {
		this.cif = cif;
		this.razonsocial = razonsocial;
		this.direccion = direccion;
		this.tlfn = tlfn;
		this.empleados = new HashSet<>();
		this.clientes = new HashSet<>();
	}

	//Getters y setters
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTlfn() {
		return tlfn;
	}

	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}
	
	public Set<Cliente> getClientes() {
		return clientes;
	}


	//Agregar clientes y empleados
	public void agregarCliente(Cliente c){
		clientes.add(c);
	}	
	
	public void agregarEmpleado(Empleado e) {
		empleados.add(e);
	}
	
	// metodo asignar
	public void asignar(String cif, String rs, String dir, String tel) {
		this.cif = cif;
		this.razonsocial = rs;
		this.direccion = dir;
		this.tlfn = tel;
	}

	// metodo obtener
	public Empresa obtener() {
		return this;
	}
}
