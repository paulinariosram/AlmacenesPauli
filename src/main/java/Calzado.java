import java.util.ArrayList;
import java.util.List;

public class Calzado extends Productos {

	
	String tipoCalzado ;

	List<Calzado> listaCalzado = new ArrayList<Calzado>();
	
	
	
	public void llenarListaCalzado() {
		
		listaCalzado.add(new Calzado("3010","20","calzado","nike","36", "100000","tenis"));
		listaCalzado.add(new Calzado("3020","15","calzado","adidas","38", "200000","tenis"));
		listaCalzado.add(new Calzado("3030","6","calzado","bata","37", "300000","tacones"));
		listaCalzado.add(new Calzado("3040","12","calzado","brahma","39", "150000","bota"));
		listaCalzado.add(new Calzado("3050","8","calzado","velez","36", "180000","sandalia"));
		listaCalzado.add(new Calzado("3060","10","calzado","bonbonite","35", "190000","botines"));
}



	public Calzado(String referencia, String stock, String tipoProducto, String marca, String talla, String precio, String tipoCalzado) {
		super(referencia, stock, tipoProducto, marca, talla, precio);
		this.tipoCalzado = tipoCalzado;

	}



	public Calzado() {
		super(null, null, null, null, null, null);
	}
	
	
	
	
}
