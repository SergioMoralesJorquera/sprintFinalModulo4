package TrabajoGrupal16;

public class Cliente extends Usuario{
	private String idCliente;
	
	public Cliente(String nombre, String apellido, String idCliente) {
		super(nombre, apellido);
		this.idCliente=idCliente;
		// TODO Auto-generated constructor stub
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Id Cliente: "+idCliente+"\n");
	}
}
