import java.util.List;

public class ClientesIntImp implements ClientesInterface {

	public boolean existeClienteLista(List<Clientes>listaClientes,String numDoc) {
		
		for (Clientes iteradorClientes : listaClientes) {
			if (numDoc.equals(iteradorClientes.numDoc)) {
					return true;
				}
			}
		
		return false;
		
	}
	public Clientes buscarListaClientes(List<Clientes> listaClientes,String numDoc) {
		
		boolean existeCliente = existeClienteLista(listaClientes,numDoc);
		if (existeCliente) {
			for (Clientes iteradorClientes :listaClientes) {
				if (numDoc.equals(iteradorClientes.numDoc)) {
					return iteradorClientes;
				}
			}
		}else {
			System.out.print("El cliente no existe");
			return null;
		}
		return null;
		
		
	}
	
	
}
