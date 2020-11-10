import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/**
 * @author Nicolas Jimenez
 * @version 1.0
 * @created 03-nov.-2020 09:21:53
 */
public class SistemaInterno {

	private List<Administrativo> administrativos;
	private BaseDeDatos db;
	private List<Turno> turnos;
	private List<Consultorio> consultorios;
	private List<Prestacion> prestaciones;
	
	public SistemaInterno(){
		// Habria que hacer un metodo para rellenar estos atributos y no tener que escribir a cada rato
		this.administrativos = new ArrayList<Administrativo>();
		this.turnos = new ArrayList<Turno>();
		this.db = new BaseDeDatos();
		this.consultorios = new ArrayList<Consultorio>();
		this.prestaciones = new ArrayList<Prestacion>();
	}
	
	public boolean loginAdmin(String user, String pass) {
		// Booleano para saber si se pudo loguear o no.
		/*
		 * Debo consultar a la BD con el usuario y contraseña para que me devuelva el nick del administrativo y un booleano para saber si es de sistemas o no.
		 */
		// Una vez tenga el nick del administrativo instancio un objeto de esa clase y lo almaceno en mi variable 'administrativos'.
		if(this.db.usuarioValido(user, pass)) {
			boolean esSistemas = this.db.esDeSistemas(user);
			Administrativo a;
			if(esSistemas){
				a = new AdministrativoSistemas(user);
			}
			else{
				a = new Administrativo(user);
			}
			this.administrativos.add(a);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean registrarAdmin(String user, String pass, boolean esSistemas) {
		if(this.db.anadirUsuario(user, pass, esSistemas)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int cantidadEstudiosRealizados(){
		int estudiosRealizados = 0;
		for(Consultorio consultorio : this.consultorios) {
			List<Estudio> estudios = consultorio.getLaboratorio().getEstudiosRealizados(); // Falta crear este metodo en la clase Consultorio
			estudiosRealizados += estudios.size();
		}
		return estudiosRealizados;
	}

	public List<Paciente> contarInasistenciasPacientes(){
		return null;
	}
	
	public HashMap<Medico,Integer> prestacionesBrindadas(){
		return null;
	}
	
	public boolean brindarTurno(Consultorio consultorio, Date fecha, Date horaFinalizacion, Date horaInicio, Medico medico, Paciente paciente){
		Turno turno = new Turno(consultorio, fecha, horaFinalizacion, horaInicio, medico, paciente);
		
		return false;
	}

	public List<Especialidad> especialidadesTurnosDisponibles(){
		return null;
	}

	public List<Prestacion> verPrestaciones(){
		return null;
	}

	public List<Turno> verTurnos(){
		return this.turnos;
	}

}