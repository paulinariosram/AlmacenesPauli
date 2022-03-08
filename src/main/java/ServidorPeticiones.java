
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServidorPeticiones")
public class ServidorPeticiones extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Clientes clientesResultadoBusqueda = new Clientes();
	public static Calzado calzadoResultadoBusqueda = new Calzado();
	public static Ropa ropaResultadoBusqueda = new Ropa();
	public static int numeroFactura;

	public ServidorPeticiones() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CalzadoInterface objetoCalzadoInterface = new CalzadoIntImpl();
		Calzado objetoCalzado = new Calzado();
		objetoCalzado.llenarListaCalzado();

		RopaInterface objetoRopaInterface = new RopaIntImp();
		Ropa objetoRopa = new Ropa();
		objetoRopa.llenarListaRopa();

		ClientesInterface objetoClientesInterface = new ClientesIntImp();
		Clientes objetoClientes = new Clientes();
		objetoClientes.llenarListaClientes();

		EmpleadosInterface objetoEmpleadosInterface = new EmpleadosIntImpl();
		Empleados objetoEmpleados = new Empleados();
		objetoEmpleados.llenarListaEmpleados();

		String parametroOperacion = request.getParameter("parametroOperacion");

		switch (parametroOperacion) {
		case "buscarCalzado":
			calzadoResultadoBusqueda = objetoCalzadoInterface.buscarCalzadoLista(objetoCalzado.listaCalzado,
					request.getParameter("refCalzado"));

			if (calzadoResultadoBusqueda != null) {
				response.getWriter().append("El zapato seleccionado es: " + calzadoResultadoBusqueda.marca + "-"
						+ calzadoResultadoBusqueda.tipoCalzado);
			} else {
				response.getWriter().append("El zapato seleccionado no existe ");
			}
			break;

		case "buscarRopa":
			ropaResultadoBusqueda = objetoRopaInterface.buscarRopaLista(objetoRopa.listaRopa,
					request.getParameter("refPrenda"));
			if (ropaResultadoBusqueda != null) {
				response.getWriter().append("La prenda seleccionada es: " + ropaResultadoBusqueda.marca + "-"
						+ ropaResultadoBusqueda.tipoPrenda);
			} else {
				response.getWriter().append("La prenda seleccionada no existe ");
			}
			break;

		case "buscarCliente":
			clientesResultadoBusqueda = objetoClientesInterface.buscarListaClientes(objetoClientes.listaClientes,
					request.getParameter("cedulaCliente"));
			if (clientesResultadoBusqueda != null) {
				response.getWriter().append("El cliente es: " + clientesResultadoBusqueda.nombre + " "
						+ clientesResultadoBusqueda.apellido);
			} else {
				response.getWriter().append("El cliente no existe ");
			}
			break;

		case "buscarEmpleado":
			Empleados empleadosResultadoBusqueda = objetoEmpleadosInterface
					.buscarListaEmpleados(objetoEmpleados.listaEmpleados, request.getParameter("cedulaEmpleado"));
			if (empleadosResultadoBusqueda != null) {
				response.getWriter().append("El empleado es: " + empleadosResultadoBusqueda.nombre + " "
						+ empleadosResultadoBusqueda.apellido);
			} else {
				response.getWriter().append("El empleado que busca no trabaja con nosostros ");
			}
			break;

		case "facturar":
			numeroFactura++;

			response.getWriter().append("Factura #: " + numeroFactura + "\n");

			response.getWriter().append("Cliente: " + clientesResultadoBusqueda.nombre + " "
					+ clientesResultadoBusqueda.apellido + "\n");
			response.getWriter().append("Producto seleccionado es: " + calzadoResultadoBusqueda.marca + "-"
					+ calzadoResultadoBusqueda.tipoCalzado + "\n");
			response.getWriter().append("Producto seleccionada es: " + ropaResultadoBusqueda.marca + "-"
					+ ropaResultadoBusqueda.tipoPrenda+"\n");
			response.getWriter()
					.append("el valor total de los productos es: " + (Double.parseDouble(ropaResultadoBusqueda.precio)
							+ Double.parseDouble(calzadoResultadoBusqueda.precio)));

			break;
		}
	}

}
