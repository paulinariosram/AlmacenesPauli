import java.util.ArrayList;
import java.util.List;

public class Ropa extends Productos {

	String tipoPrenda ;
	String color ;
	List<Ropa> listaRopa = new ArrayList<Ropa>();
	
	
	
	public void llenarListaRopa() {
		
		listaRopa.add(new Ropa("8010","20","ropa","colorblue","s", "50000","vestido","negro"));
		listaRopa.add(new Ropa("8020","15","ropa","colorblue","s", "70000","vestido","verde"));
		listaRopa.add(new Ropa("8030","30","ropa","ela","8","jean", "65000","negro"));
		listaRopa.add(new Ropa("8040","12","ropa","people","10", "80000","jean","blanco"));
		listaRopa.add(new Ropa("8050","8","ropa","gef","s", "20000","camiseta","negro"));
		listaRopa.add(new Ropa("8060","50","ropa","punto Blanco","m", "35000","Camiseta","blanca"));

	}



	public Ropa(String referencia, String stock, String tipoProducto, String marca, String talla, String precio, String tipoPrenda,
			String color) {
		super(referencia, stock, tipoProducto, marca, talla, precio);
		this.tipoPrenda = tipoPrenda;
		this.color = color;
	}



	public Ropa() {
		super(null, null, null, null, null, null);
	}


	
	
}
