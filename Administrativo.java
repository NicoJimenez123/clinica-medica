import java.util.List;

/**
 * @author Nicolas Jimenez
 * @version 1.0
 * @created 03-nov.-2020 09:21:52
 */
public class Administrativo {

	private Turno m_Turno;
	public Paciente m_Paciente;

	public Administrativo(){

	}

	public void finalize() throws Throwable {

	}

	public boolean brindarTurno(){
		return false;
	}

	public List<Especialidad> especialidadesTurnosDisponibles(){
		return null;
	}

	public List<Prestacion> verPrestaciones(){
		return null;
	}

	public List<Turno> verTurnos(){
		return null;
	}

}