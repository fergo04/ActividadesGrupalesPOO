public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Voluntario v0 = AdministradorDeConsola.crearVoluntario();
		Voluntario vol1 = new Voluntario("Ana Mora", "88752650", "anamoraar@gmail.com");
		Voluntario vol2 = new Voluntario("Mateo Mena", "70723457", "mateo05@hotmail.com");
		Voluntario vol3 = new Voluntario("Sofía Salazar", "89279812", "sofs4@gmail.com");
		
		AdministradorDeConsola.inscribirVoluntarioAEvento(vol1);
		
		vol1.listarEventos();
		
		vol1.inscribirseEnEvento("Campaña recolección de basura");
		vol1.inscribirseEnEvento("Repartimiento de almuerzos");
		vol1.inscribirseEnEvento("Campaña limpieza de río");
		
		
		vol2.inscribirseEnEvento("Repartimiento de desayunos", "18/09/2021 06:00", "18/09/2021 10:30");
		
		System.out.println(vol1.toString());
		vol1.listarEventos();
		System.out.println(vol2.toString());
		vol2.listarEventos();
		System.out.println(vol3.toString());
		vol3.listarEventos();*/
		
		Organizacion org = new Organizacion("Accion Union");
		Organizador organizador = org.agregarOrganizador("Sofía Salazar", "89279812", "sofs4@gmail.com");
		organizador.inscribirseEnEvento("Campaña vacunación");
		organizador.agregarEvento("Limpieza de calles", 120, organizador);
		
		//Donante donante= new Donante("Isaac puto", 69);
		//donante.realizarDonacion(1000, "18/09/2021 06:00", "18/09/2021 10:30");
		//System.out.println(donante.toString());
		org.agregarDonante("Daniel Campos", 175490395, 30000,"18/02/2021 06:00");
		org.agregarDonante("Pedro Rodriguez", 256789010, 5000,"05/09/2021 02:00");
		org.agregarDonante("Antonio Fernandez", 109845326, 55000,"22/10/2021 07:00");
		org.listarDonantes();
		org.toString();
		org.verAprobacion();
		org.cuentasOrganizacion();
		Voluntario v1= new Voluntario("jose","7677","hola@");
		v1.inscribirseEnEvento("partido", 1000, organizador, v1);

		
		
		//System.out.println(organizador.toString());
		
		
		
	}

}