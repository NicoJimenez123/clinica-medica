import java.util.Scanner;

public class Prestacion {

	private Medico doctor;
	private String nombrePrestacion;
	public Medico m_Medico;
	public AreaMedica m_AreaMedica;
	private Consultorio m_Consultorio;


	//COONSTRUCTORES
	public Prestacion(){}

	public Prestacion(Medico doctor, String nombrePrestación, Medico m_Medico, AreaMedica m_AreaMedica, Consultorio m_Consultorio){
		this.doctor = doctor;
		this.nombrePrestación = nombrePrestación;
		this.m_Medico = m_Medico;
		this.m_AreaMedica = m_AreaMedica;
		this.m_Consultorio = m_Consultorio;
	}

	public String recetar(){

		//pido el ingreso de la receta
		System.out.println("Ingrese receta: ");

		//obtengo los caracteres tipeados
		Scanner entradaScanner = new Scanner(System.in);
		String entradaTeclado = "";
		entradaTeclado = entradaScanner.nextLine();

		return "Receta: \n" + entradaTeclado;
	}


	// GETTERS

	public Medico getDoctor(){
		return this.doctor;
	}

	public String getNombrePrestacion(){
		return this.nombrePrestacion;
	}

	public Medico getm_Medico(){
		return this.m_Medico;
	}

	public AreaMedica getm_AreaMedica(){
		return this.m_AreaMedica;
	}

	public Consultorio getm_Consultorio(){
		return this.m_Consultorio;
	}

	// SETTERS 
	public void setDoctor(Doctor doctor){
		this.doctor = doctor;
	}

	public void setNombrePrestacion(String nombrePrestacion){
		this.nombrePrestacion = nombrePrestacion;
	}

	public void setm_Medico(Medico m_Medico){
		this.m_Medico = m_Medico;
	}

	public void setm_AreaMedica(AreaMedica m_AreaMedica){
		this.m_AreaMedica = m_AreaMedica;
	}

	public void setm_Consultorio(Consultorio m_Consultorio){
		this.m_Consultorio = m_Consultorio;
	}



}