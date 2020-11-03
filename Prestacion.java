import java.util.Scanner;

public class Prestacion {

	private Medico doctor;
	private String nombrePrestación;
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

}