import java.util.ArrayList;

public class Organizacion {
	
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Evento> eventos;
	private ArrayList<Donante> donantes;
	private int saldo;
	
	public Organizacion(String nombre) {
		this.nombre = nombre;
		this.usuarios = new ArrayList<Usuario>();
		this.eventos = new ArrayList<Evento>();
		this.donantes = new ArrayList<Donante>();
		this.saldo= 0;
	}
	
	public void agregarVoluntario(String nombreCompleto, String telefono, String correoElectronico) {
		Voluntario v1 = new Voluntario(nombreCompleto, telefono, correoElectronico);
		usuarios.add(v1);
	}
	
	public Organizador agregarOrganizador(String nombreCompleto, String telefono, String correoElectronico) {
		Organizador o1 = new Organizador(nombreCompleto, telefono, correoElectronico);
		usuarios.add(o1);
		return o1;
	}
	
	public Donante agregarDonante(String nombre, int cedula, int donacion, String inicio) {
		Donante d1= new Donante(nombre,cedula);
		donantes.add(d1);
		d1.realizarDonacion(donacion, inicio);
		this.saldo+=donacion;
		return d1;
	}
	
	public Usuario getUsuario(int indice) {
		return this.usuarios.get(indice);
	}
	
	public void listarDonantes() {
		if(this.donantes.isEmpty()) {
			System.out.println("No tiene donantes asociados");
		}
		else {
			System.out.println(">Donantes asociados:");
			for(int i = 0; i<this.donantes.size(); i++) {
				System.out.println(this.donantes.get(i).toString());
			}
		}
		System.out.println();
	}
	
	public void verAprobacion() {
		if(this.eventos.isEmpty()) {
			System.out.println("No tiene eventos asociados");
		}
		else {
			System.out.println(">eventos asociados:");
			for(int i = 0; i<this.eventos.size(); i++) {
				this.eventos.get(i).aprobar();
				System.out.println(this.eventos.get(i).toString());
			}
		}
	}
	public void cuentasOrganizacion() { 
		System.out.println("saldo total: "+saldo);
		int saldoGastado=0;
		for(int i = 0; i<this.eventos.size(); i++) {
			int saldoComprometido=this.eventos.get(i).getCostoEvento();
			saldoGastado= this.saldo-saldoComprometido;
			
	}
		System.out.println("Saldo gastado: "+ saldoGastado);
	}
}