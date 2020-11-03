import java.util.Date;

public class Estudio {

	private boolean asistencia;
	private Date fechaRealizar;
	private Prestacion m_Prestacion;


	//CONSTRUCTORES
	public Estudio(){}

	public Estudio(boolean asistencia, Date fechaRealizar, Prestacion m_Prestacion){
		this.asistencia = asistencia;
		this.fechaRealizar = fechaRealizar;
		this.m_Prestacion = m_Prestacion;
	}

	//GETTERS Y SETTERS


}