

/**
 * @author Nicolas Jimenez
 * @version 1.0
 * @created 03-nov.-2020 09:21:53
 */
public class Paciente {

	private String apellido;
	private int dni;
	private String domicilio;
	private String nombre;
	private Turno turnos;
	private Turno m_Turno;

	public Paciente(){

	}

	public void finalize() throws Throwable {

	}

	public boolean abonarPrestacion(){
		return false;
	}

}