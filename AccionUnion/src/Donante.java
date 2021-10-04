import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Donante {
	//Atributos
	private String nombre;
	private int cedula;
	private LocalDateTime inicio;
	private int donacion;
	
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	//Constructor
	public Donante(String nombre, int cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.donacion= 0;
	}
	
	//Getters y Setters
	
	public int getDonacion() {
		return donacion;
	}



	public void setDonacion(int donacion) {
		this.donacion = donacion;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}



	//Metodos
	public void realizarDonacion(int donacion, String inicio) {
		this.donacion+=donacion;
		this.inicio = LocalDateTime.parse(inicio, formato);
	}

	@Override
	public String toString() {
		return "Donante nombre= " + nombre + ", cedula= " + cedula + ", donacion= " + donacion +", fecha/hora= "+ this.inicio.format(formato);
	}
	
	
}
