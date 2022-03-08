import java.util.List;

import javax.print.attribute.standard.NumberOfDocuments;

public class CalzadoIntImpl implements CalzadoInterface {

	
	public boolean existeCalzadoLista(List<Calzado>listaCalzado, String referencia) {
		
		for(Calzado iteradorCalzado: listaCalzado) {
			if (referencia.equals(iteradorCalzado.referencia)) {
				
				return true;
			}
			
		}
		return false;
		
	}
	public Calzado buscarCalzadoLista(List<Calzado>listaCalzado,String referencia) {
		
		boolean existeCalzado = existeCalzadoLista(listaCalzado, referencia);
		if(existeCalzado) {
			for(Calzado iteradorCalzado : listaCalzado) {
				if(referencia.equals(iteradorCalzado.referencia)) {
					return iteradorCalzado;
				}
			}
		}else {
			System.out.print("El calzado no existe");
			return null;
		}
		return null;
	}
}
