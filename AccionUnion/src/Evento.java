import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
	//Atributos
	private String nombre;
	private int id;
	private static int contadorEventos = 1;
	private boolean aprobado;
	private int costoEvento;
	private Usuario creador;
	
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	//Constructores
	public Evento(String nombre, int costo, Usuario creador) {
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.aprobado = false;
		this.costoEvento = costo;
		this.creador= creador;
	}
	public Evento(String nombre) {
		this.nombre = nombre;
		this.aprobado = false;
		this.id = contadorEventos++;
	}
	
	public Evento(String nombre, String inicio, String fin, int costo, Usuario creador) {
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.inicio = LocalDateTime.parse(inicio, formato);
		this.fin = LocalDateTime.parse(fin, formato);
		this.aprobado = false;
		this.costoEvento = costo;
		this.creador= creador;
	}
	
	
	public Evento(String nombre, String inicio, String fin) {
		super();
		this.nombre = nombre;
		this.id = contadorEventos++;
		this.aprobado = false;
		this.inicio = LocalDateTime.parse(inicio, formato);
		this.fin = LocalDateTime.parse(fin, formato);
	}

	//Getters y Setters
	public boolean getAprobado() {
		return this.aprobado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	
	public int getCostoEvento() {
		return costoEvento;
	}
	public void aprobar() {
		this.aprobado=true;
	}
	

	
	//Sobreescritos
	@Override
	public String toString(){
		String info = this.id+". "+this.nombre +" "+ this.aprobado;
		if(this.inicio != null && this.fin != null) {
			info += " (" + this.inicio.format(formato) + " - " + this.fin.format(formato) + ")";
		}
		return info;
	}

}