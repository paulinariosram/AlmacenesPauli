import java.util.ArrayList;
import java.util.List;

public class Empleados extends Personas {

	
	String telefono ;
	String email ;
	String cargo ;
	List<Empleados> listaEmpleados = new ArrayList<Empleados>();
	
	
	public void llenarListaEmpleados() {
		
		listaEmpleados.add(new Empleados("sara","perez","TI","1021900","2303030","sara@gmail.com","vendedor"));
		listaEmpleados.add(new Empleados("marta","correa","TI","1021100","2301030","marta@gmail.com","bodeguero"));
		listaEmpleados.add(new Empleados("pedro","ramirez","TI","1021200","2302030","pedro@gmail.com","vendedor"));
		listaEmpleados.add(new Empleados("Jose","martinez","TI","1021300","2304030","Jose@gmail.com","Administrador"));
		listaEmpleados.add(new Empleados("octavio","zapata","TI","1021400","2305030","octavio@gmail.com","despachador"));
	}


	public Empleados(String nombre, String apellido, String tipoDoc, String numDoc, String telefono, String email,
			String cargo) {
		super(nombre, apellido, tipoDoc, numDoc);
		this.telefono = telefono;
		this.email = email;
		this.cargo = cargo;
		
	}


	public Empleados() {
		super(null, null, null, null);
	}
	
	
	
	
}
