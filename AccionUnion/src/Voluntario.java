import java.util.ArrayList;

public class Voluntario extends Usuario {
	//Atributos
	protected ArrayList<Evento> eventos;
	
	//Constructor
	public Voluntario(String nombre, String telefono, String correoElectronico) {
		super(nombre, telefono, correoElectronico);
		eventos = new ArrayList<Evento>();
	}


	//Metodos
	public void inscribirseEnEvento(String nombre, String inicio, String fin) {
		Evento evento = new Evento(nombre, inicio, fin);
		this.eventos.add(evento);
	}
	
	public void inscribirseEnEvento(String nombre) {
		Evento evento = new Evento(nombre);
		this.eventos.add(evento);
	}
	
	public void listarEventos() {
		if(this.eventos.isEmpty()) {
			System.out.println("No tiene eventos asociados");
		}
		else {
			System.out.println(">Eventos asociados:");
			for(int i = 0; i<this.eventos.size(); i++) {
				System.out.println(this.eventos.get(i).toString());
			}
		}
		System.out.println();
	}
	public void inscribirseEnEvento(String nombre, int costo, Usuario organizador, Usuario creador) {
		Evento evento = new Evento(nombre, costo, creador);
		//evento.aprobar();
		if(creador.equals(organizador)==false) {
			evento.aprobar();
			eventos.add(evento);
		}else if(creador.equals(organizador)==true) {
			System.out.println("Evento no aprobado, este usuario no puede aprobar el evento");
		}
	}
}