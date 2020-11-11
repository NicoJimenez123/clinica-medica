import java.util.List;
import java.time.*;

public class Turno {
	
	private int consultorio;	
    private LocalDate fecha;
    private LocalTime horaFinaliacion;
    private LocalTime horaInicio;
    private Medico medico;
    private Paciente paciente;
    private List<Turno> Turno;
    private boolean turnoConcurrido;
	
    
    public Turno(int consultorio2, LocalDate fecha, LocalTime horaFinaliacion, LocalTime horaInicio, Medico medico,
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


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public LocalTime getHoraFinaliacion() {
		return horaFinaliacion;
	}


	public void setHoraFinaliacion(LocalTime horaFinaliacion) {
		this.horaFinaliacion = horaFinaliacion;
	}


	public LocalTime getHoraInicio() {
		return horaInicio;
	}


	public void setHoraInicio(LocalTime horaInicio) {
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
