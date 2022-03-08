import java.util.List;

public interface ClientesInterface {

	boolean existeClienteLista(List<Clientes>listaClientes,String numDoc);
	Clientes buscarListaClientes(List<Clientes> listaClientes,String numDoc);
	
	
}
