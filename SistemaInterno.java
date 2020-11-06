import java.util.ArrayList;
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
	
	public SistemaInterno(){
		this.administrativos = new ArrayList<Administrativo>();
		this.db = new BaseDeDatos();
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
		return 0;
	}

	public List<Paciente> contarInasistenciasPacientes(){
		return null;
	}
	
	public HashMap<Medico,Integer> prestacionesBrindadas(){
		return null;
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