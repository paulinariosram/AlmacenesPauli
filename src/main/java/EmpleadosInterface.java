import java.util.List;

public interface EmpleadosInterface {

	
	boolean existeEmpleadoLista(List<Empleados>listaEmpleados,String numDoc);
	Empleados buscarListaEmpleados(List<Empleados> listaEmpleados,String numDoc);
	
}
