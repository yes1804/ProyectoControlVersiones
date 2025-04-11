package asociacion;

public class Test {

	public static void main(String[] args) {
		
		// Creación de Departamentos
		Departamento dep1 = new Departamento(28400, "MAD-ESP", "Collado Villalba");
		Departamento dep2 = new Departamento(28047, "MAD-ESP", "Aluche");

		// Creación de Empleados y asignación al departamento
		Empleado emp1 = new Empleado(1, "Eric B", "Jefe", 2500, dep1);
		Empleado emp2 = new Empleado(2, "Laura M", "Desarrolladora", 2200, dep1);
		Empleado emp3 = new Empleado(3, "Carlos G", "Jefe", 2300, dep2);
		Empleado emp4 = new Empleado(4, "Sofía R", "Diseñadora UX/UI", 2000, dep2);
		Empleado emp5 = new Empleado(5, "Javier T", "Soporte Técnico", 1800, dep1);
		Empleado emp6 = new Empleado(6, "Marta P", "Contadora", 2600, dep2);

		// Agregar empleados a los departamentos
		dep1.añadirEmpleado(emp1);
		dep1.añadirEmpleado(emp2);
		dep1.añadirEmpleado(emp5);
		dep2.añadirEmpleado(emp3);
		dep2.añadirEmpleado(emp4);
		dep2.añadirEmpleado(emp6);

		// Asignamos empleados a emp1 (haciendo que sea jefe)
		emp1.agregarEmpleado(emp2);
		emp1.agregarEmpleado(emp3);
		emp1.agregarEmpleado(emp5);
		
		//intentamos agregar un subordinado a un empleado que no es jefe
		emp2.agregarEmpleado(emp6);

		// Asignamos empleados a emp3 (haciendo que sea jefe)
		emp3.agregarEmpleado(emp4);
		emp3.agregarEmpleado(emp6);

		// Mostrar información de los departamentos y empleados
		System.out.println(dep1);
		System.out.println(dep2);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);

	}

}
