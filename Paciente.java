import java.util.ArrayList;
import java.util.List;

public class Paciente {
	
	private String nombre ;
	private  String apellido; 
	private int dni;
	private String direccion;
	private List<Turno> turnos;
	
	
	
	public Paciente(String nombre, String apellido, int dni, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.turnos = new ArrayList<Turno>();
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



	public List<Turno> getTurnos() {
		return turnos;
	}



	public void setTurnos(Turno turno) {
		this.turnos.add(turno);
	}
	
	
	public boolean abonaPrestacion() {
		
	return false;
		
	}

}
