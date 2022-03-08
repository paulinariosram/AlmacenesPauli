import java.util.List;

public class RopaIntImp implements RopaInterface {

	
	
	public boolean existeRopaLista(List<Ropa>listaRopa,String referencia) {
		for (Ropa iteradorRopa : listaRopa) {
			if (referencia.equals(iteradorRopa.referencia)) {
					return true;
				}
			}
		
		return false;
		
	}
	public Ropa buscarRopaLista(List<Ropa>listaRopa,String referencia) {
		
		boolean existeRopa = existeRopaLista(listaRopa,referencia);
		if (existeRopa) {
			for (Ropa iteradorRopa :listaRopa) {
				if (referencia.equals(iteradorRopa.referencia)) {
					return iteradorRopa;
				}
			}
		}else {
			System.out.print("La prenda no existe");
			return null;
		}
		return null;
	}
}
