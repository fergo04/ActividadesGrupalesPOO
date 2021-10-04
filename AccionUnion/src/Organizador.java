import java.util.ArrayList;

public class Organizador extends Voluntario{
	
	private ArrayList<Evento> eventosCreados;
	
	public Organizador(String nombre, String telefono, String correoElectronico) {
		super(nombre, telefono, correoElectronico);
		eventosCreados = new ArrayList<Evento>();
	}
	
	public void agregarEvento(String nombre, String inicio, String fin, int costo, Usuario creador) {
		Evento evento = new Evento(nombre, inicio, fin, costo, creador);
		this.eventosCreados.add(evento);
	}
	
	public void agregarEvento(String nombre, int costo, Usuario creador) {
		Evento evento = new Evento(nombre, costo, creador);
		this.eventosCreados.add(evento);
		evento.aprobar();
	}
	
	@Override
	public String toString() {
		String info = super.toString()+'\n'+">Eventos por asistir:";
		for(int i = 0; i<this.eventos.size(); i++) {
			info += '\n'+this.eventos.get(i).toString();
		}
		info += '\n'+">Eventos creados:";
		for(int i = 0; i<this.eventosCreados.size(); i++) {
			info += '\n'+this.eventosCreados.get(i).toString();
		}
		return info;
	}

}