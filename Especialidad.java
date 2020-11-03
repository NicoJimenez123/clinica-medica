

public class Especialidad {

	private String nombreEspecialidad;
	private Medico m_Medico;

	//CONSTRUCTORES
	public Especialidad(){}

	public Especialidad(String nombreEspecialidad, Medico m_Medico){
		this.nombreEspecialidad = nombreEspecialidad;
		this.m_Medico = m_Medico;
	}

	//GETTERS Y SETTERS
	public Medico getNombreEspecialidad(){
		return this.nombreEspecialidad; 
	}

	public Medico getM_Medico(){
		return this.m_Medico;
	}

	public void setNombreEspecialidad(String nombreEspecialidad){
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public void setM_Medico(Medico m_Medico){
		this.m_Medico = m_Medico;
	}

}
