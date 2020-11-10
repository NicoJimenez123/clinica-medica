import java.util.Date;
import java.util.List;

public class Turno {
	
	private int consultorio;	
    private Date fecha;
    private Date horaFinaliacion;
    private Date horaInicio;
    private Medico medico;
    private Paciente paciente;
    private List<Turno> Turno;
    private boolean turnoConcurrido;
	
    
    public Turno(int consultorio2, Date fecha, Date horaFinaliacion, Date horaInicio, Medico medico,
			Paciente paciente) {
		super();
		this.consultorio = consultorio2;
		this.fecha = fecha;
		this.horaFinaliacion = horaFinaliacion;
		this.horaInicio = horaInicio;
		this.medico = medico;
		this.paciente = paciente;
		this.turnoConcurrido = false;
	}


	public int getConsultorio() {
		return consultorio;
	}


	public void setConsultorio(int consultorio) {
		this.consultorio = consultorio;
	}


	public List<Turno> getTurno() {
		return Turno;
	}


	public void setTurno(List<Turno> turno) {
		Turno = turno;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Date getHoraFinaliacion() {
		return horaFinaliacion;
	}


	public void setHoraFinaliacion(Date horaFinaliacion) {
		this.horaFinaliacion = horaFinaliacion;
	}


	public Date getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
    
    public boolean fueConcurrido() {
    	return this.turnoConcurrido;
    }
    
    public void setConcurrencia(boolean concurrido) {
    	this.turnoConcurrido = concurrido;
    }
    
}
