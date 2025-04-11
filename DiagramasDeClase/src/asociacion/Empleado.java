package asociacion;

import java.util.HashSet;
import java.util.Set;

public class Empleado {
	private int codigo;
	private String nombre;
	private String oficio;
	private double salario;
	private Departamento departamento;
	private Set<Empleado> empleadosCargo;

	// Constructor con Parametros
	public Empleado(int codigo, String nombre, String oficio, double salario, Departamento departamento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.oficio = oficio;
		this.salario = salario;
		this.departamento = departamento;
		// Se instancia el atributo Set como HashSet para que cada objeto tenga un set independiente.
		this.empleadosCargo = new HashSet<>();
	}

	// Constructor por Defecto
	public Empleado() {
		this.codigo = 0;
		this.nombre = "Sin Especificar";
		this.oficio = "Sin Asignar";
		this.salario = 0.0;
	}

	// Getters y Setters
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

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Set<Empleado> getEmpleadosCargo() {
		return empleadosCargo;
	}

	// Se elimina el set debido a que se existe el metodo agregar empleado

	// Metodo agregarEmpleado
	public void agregarEmpleado(Empleado empleado) {
		if (this.oficio.equalsIgnoreCase("Jefe")) {
			empleadosCargo.add(empleado);
		} else {
			System.out.println(this.nombre + " No puede agregar empleados porque no es jefe.");
		}
	}

	// Metodo para mostrar los empleados que tiene a cargo un Jefe
	public String mostrarEmpleadosaCargo() {
		String resultado;
		if (empleadosCargo.isEmpty()) {
			return resultado = " ";

		}
		resultado = "Empleados a cargo:\n";
		for (Empleado empleado : empleadosCargo) {
			resultado += " • " + empleado.getNombre() + "\n";
		}
		return resultado;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "\n Empleado \n Codigo: " + codigo + "\n Nombre: " + nombre + "\n Oficio: " + oficio + "\n Salario:"
				+ salario + "\n Departamento: " + departamento.getNombre() + "\n " + mostrarEmpleadosaCargo();
	}
}
