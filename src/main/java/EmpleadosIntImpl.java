import java.util.List;

public class EmpleadosIntImpl implements EmpleadosInterface{

	
	public boolean existeEmpleadoLista(List<Empleados>listaEmpleados,String numDoc) {
		
		for(Empleados iteradorEmpleados:listaEmpleados) {
		if(numDoc.equals(iteradorEmpleados.numDoc)) {
			return true;
		}
	}
	
	return false;
}
	public Empleados buscarListaEmpleados(List<Empleados> listaEmpleados,String numDoc) {
		
		boolean existeEmpleado= existeEmpleadoLista(listaEmpleados,numDoc);
		if(existeEmpleado) {
			for(Empleados iteradorEmpleados :listaEmpleados) {
				if(numDoc.equals(iteradorEmpleados.numDoc)) {
					return iteradorEmpleados;
				}
				
			}
		}else {
				System.out.print("El empleado no existe");
				return null;
			}
			return null;
		
		
	}
}
