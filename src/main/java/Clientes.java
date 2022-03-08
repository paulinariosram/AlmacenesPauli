import java.util.ArrayList;
import java.util.List;

public class Clientes extends Personas {

	String email;
	String tipoCliente;
	List<Clientes> listaClientes = new ArrayList<Clientes>();

	
	
	
	public void llenarListaClientes() {

		listaClientes.add(new Clientes("Paulina", "Rios", "cedula", "43200", "paulina@gmail", "frecuente"));
		listaClientes.add(new Clientes("Sandra", "Ruiz", "cedula", "43300", "sandra@gmail", "estudiante"));
		listaClientes.add(new Clientes("Martin", "Cortés", "cedula", "98200", "martin@gmail", "oro"));
		listaClientes.add(new Clientes("Juan", "Morales", "cedula", "98300", "juanm@gmail", "plata"));

	}




	public Clientes(String nombre, String apellido, String tipoDoc, String numDoc, String email, String tipoCliente) {
		super(nombre, apellido, tipoDoc, numDoc);
		this.email = email;
		this.tipoCliente = tipoCliente;

	}




	public Clientes() {
		super(null, null, null, null);
	}


	
	
}
