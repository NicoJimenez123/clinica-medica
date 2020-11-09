
public class Paciente {
	
	private String nombre ;
	private  String apellido; 
	private int dni;
	private String direccion;
	private Turno turnos;
	
	
	
	public Paciente(String nombre, String apellido, int dni, String direccion, Turno turnos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.turnos = turnos;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Turno getTurnos() {
		return turnos;
	}



	public void setTurnos(Turno turnos) {
		this.turnos = turnos;
	}
	
	
	public boolean abonaPrestacion() {
		
	return false;
		
	}

}
