import java.util.List;

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