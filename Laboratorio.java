import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
	
	private List<Estudio> estudiosAsociados;
	private boolean estaOcupado;
	
	public Laboratorio() {
		super();
		this.cargarEstudiosAsociados();
	}

	private void cargarEstudiosAsociados() {
		// Este metodo implicaria obtener los estudios de la BD
		this.estudiosAsociados = new ArrayList<Estudio>();
	}
	
	public List<Estudio> getEstudiosAsociados() {
		return this.estudiosAsociados;
	}

	public void anadirEstudio(Estudio estudio) {
		this.estudiosAsociados.add(estudio);
	}
	
	public boolean realizarEstudio(Estudio estudio) {
		if(this.estudiosAsociados.contains(estudio)) {
			this.estaOcupado = true;
			// Aca habria un tiempo de espera hasta que se haya hecho el estudio
			return true;
		}
		return false;
	}
	
	
	
		
		
	

}
