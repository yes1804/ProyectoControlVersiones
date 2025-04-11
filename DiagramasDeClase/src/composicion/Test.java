package composicion;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Crear una empresa
        Empresa empresa = new Empresa(null, null, null, null);
        empresa.asignar("CIF123456", "Mi Empresa S.A.", "Calle Principal 123", "987654321");

        // Crear empleados
        Empleado empleado1 = new Empleado(null, null, null, 0, null, 0.0);  
        empleado1.asignar("Juan Pérez", new GregorianCalendar(1985, Calendar.APRIL, 12).getTime(),
                "654321987", 101, new GregorianCalendar(2010, Calendar.JUNE, 15).getTime(), 2500.00);

        Empleado empleado2 = new Empleado(null, null, null, 0, null, 0.0);  
        empleado2.asignar("Ana Gómez", new GregorianCalendar(1990, Calendar.MAY, 22).getTime(),
                "675849302", 102, new GregorianCalendar(2015, Calendar.JULY, 10).getTime(), 3000.00);

        // Crear un director
        Director director = new Director(null, null, null, 0, null, 0.0, null, null);  
        director.asignar("Carlos López", new GregorianCalendar(1980, Calendar.MARCH, 1).getTime(),
                "612345678", 201, new GregorianCalendar(2005, Calendar.MARCH, 10).getTime(), 5000.00,
                "Gerente", new GregorianCalendar(2015, Calendar.JANUARY, 1).getTime());

        // Crear clientes
        Cliente cliente1 = new Cliente(null, null, null, 0, null, 0.0);  
        cliente1.asignar("Lucía Martínez", new GregorianCalendar(1988, Calendar.JANUARY, 5).getTime(),
                "623456789", 301, "Compañía X", 10.5);

        Cliente cliente2 = new Cliente(null, null, null, 0, null, 0.0); 
        cliente2.asignar("Pedro Ruiz", new GregorianCalendar(1992, Calendar.JULY, 18).getTime(),
                "634567890", 302, "Compañía Y", 8.5);

        // Agregar empleados y clientes a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarCliente(cliente1);
        empresa.agregarCliente(cliente2);

        // Mostrar datos de la empresa
        System.out.println("Empresa: " + empresa.obtener().getRazonsocial());
        System.out.println("Dirección: " + empresa.obtener().getDireccion());
        System.out.println("Teléfono: " + empresa.obtener().getTlfn());
        System.out.println("CIF: " + empresa.obtener().getCif());
        
        // Mostrar empleados
        System.out.println("\nEmpleados:");
        for (Empleado emp : empresa.getEmpleados()) {
            System.out.println(emp.obtener().getNombre() + ", Salario: " + emp.obtener().getSalario());
        }

        // Mostrar clientes
        System.out.println("\nClientes:");
        for (Cliente cli : empresa.getClientes()) {
            System.out.println(cli.obtener().getNombre() + ", Empresa: " + cli.obtener().getEmpresa() + ", Comisión: " + cli.obtener().getComsion());
        }

        // Mostrar director
        System.out.println("\nDirector:");
        System.out.println(director.getNombre() + ", Categoría: " + director.getCategoria() + ", Fecha de Alta: " + director.getFechadirector());
    }
}
