package composicion;

import java.util.Date;

public class Cliente extends Persona {
	private int codcliente;
	private String empresa;
	private double comsion;

//constructor
	public Cliente(String nombre, Date fechanac, String tlfn, int codcliente, String empresa, double comsion) {
		super(nombre, fechanac, tlfn);
		this.codcliente = codcliente;
		this.empresa = empresa;
		this.comsion = comsion;
	}

	//getters and setters
	public int getCodcliente() {
		return codcliente;
	}

	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getComsion() {
		return comsion;
	}

	public void setComsion(double comsion) {
		this.comsion = comsion;
	}
	
	//metodo asignar
	public void asignar(String nom, Date fecha, String tel, int codcli, String emp, double com) {
		super.asignar(nom, fecha, tel);
		this.codcliente = codcli;
		this.empresa = emp;
		this.comsion = com;
	}
	
	//metodo Obtener
	public Cliente obtener() {
			return this;
	}

}
