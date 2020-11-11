import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.*;
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
	private List<Paciente> pacientes;
	
	public SistemaInterno(){
		// Habria que hacer un metodo para rellenar estos atributos y no tener que escribir a cada rato
		this.administrativos = new ArrayList<Administrativo>();
		this.turnos = new ArrayList<Turno>();
		this.db = new BaseDeDatos();
		this.consultorios = new ArrayList<Consultorio>();
		this.prestaciones = new ArrayList<Prestacion>();
		this.pacientes = new ArrayList<Paciente>();
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
		List<Paciente> pacientesInasistentes = new ArrayList<Paciente>();
		HashMap<Paciente, Integer> pacientesEInasistencias = new HashMap<Paciente,Integer>();
		// Reviso los turnos que no fueron concurridos
		for(Turno t : this.turnos) {
			if(!t.fueConcurrido()) {
				// Voy contando las inasistencias por paciente mientras lo guardo en un diccionaro del tipo Paciente-Inasistencias
				Paciente p = t.getPaciente();
				Integer i = 0;
				if(pacientesEInasistencias.containsKey(t.getPaciente())) {
					// Pregunto si el paciente ya se encuentra en la lista y si lo está le sumo una inasistencia
					i = pacientesEInasistencias.get(p) + 1;
					pacientesEInasistencias.put(p, i);
				}
				else {
					// Si el paciente no esta en la lista, lo agrego con una asistencia
					pacientesEInasistencias.put(p, 1);
				}
			}
			// Si fue concurrido no hago nada
		}
		// Una vez que tengo a los pacientes y sus inasistencias, voy comparando las inasistencias con el numero permitido de ellas.
		int inasistenciasMaximas = 3;
		for(Paciente p : pacientesEInasistencias.keySet()) {
			if(pacientesEInasistencias.get(p) >= inasistenciasMaximas) {
				// Si supera las inasistencias maximas lo agrego a la lista de pacientes a llamar por el personal administrativo
				pacientesInasistentes.add(p);
			}
		}
		return pacientesInasistentes;
	}
	
	public HashMap<Medico,Integer> prestacionesBrindadas(){
		// Metodo para obtener un reporte de la cantidad de prestaciones brindadas por cada metodo
		HashMap<Medico,Integer> medicos = new HashMap<Medico,Integer>();
		for(Medico m : this.prestaciones.getMedico()) {
			medicos.put(m, new Integer(m.getAsistenciasRegistradas()));
		}
		return medicos;
	}
	
	public boolean brindarTurno(int consultorio, LocalDate fecha, LocalTime horaFinalizacion, LocalTime horaInicio, Medico medico, Paciente paciente){
		Turno turno = new Turno(consultorio, fecha, horaFinalizacion, horaInicio, medico, paciente);
		return true;
	}

	public List<Especialidad> especialidadesTurnosDisponibles(){
		// Voy a desarrollar el metodo en base a que se pregunta por los turnos que se pueden dar en el dia de la fecha
		return null;
	}

	public List<Prestacion> verPrestaciones(){
		return null;
	}

	public List<Turno> verTurnos(Paciente p){
		return p.getTurnos();
	}

}