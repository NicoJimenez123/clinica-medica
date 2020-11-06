import java.time.LocalDate;
import java.util.Scanner;

public class Medico {

	//private String id;   **PROPUESTO**

	private Especialidad especialidad;

	//CONSTRUCTORES
	public Medico(){}

	public Medico(Especialidad especialidad){
		this.especialidad = especialidad;
	}


	//GETTERS Y SETTERS
	public Especialidad getEspecialidad(){
		return this.especialidad;
	}
	public void setEspecialidad(Especialidad especialidad){
		this.especialidad = especialidad;
	}


	//METODOS VARIOS

	public void cargarEstudio(){

		LocalDate fecha = LocalDate.now(); //fecha y hora actual
		String prestacion = "";



		//pido el ingreso de datos para prestacion
		System.out.println("Ingrese el nombre de la  prestacion: ");

		Scanner entradaScanner = new Scanner(System.in);
		
		prestacion = entradaScanner.nextLine();



		//creo el nuevo estudio

		Estudio nuevoEstudio = new Estudio(true, fecha, prestacion);

		/*

		NOTA
			Acá va a tirar error porque no se está guardando un objeto Prestación
			sino un String. Para poder guardar un objeto necesito 
			acceder a la lista de prestaciones de la clase Administrativo (donde compararía el nombre ingresado por Scanner 
			con algun nombrePrestación de la lista) o necesito que ingrese a 
			este método una prestación por parametro.

		REVISAR

		*/


	}

	public void cargarReceta(){
		/*

		NOTA
			Acá necesitaría que ingrese una prestación por parámetro para poder
			usar el método Prestacion.recetar()

		REVISAR

		*/
	}

	public void registrarAsistencia(){
		/*

		NOTA
			Al cargar un nuevoEstudio ya se confirma la asistencia, no? Al 
			setear asistencia = TRUE

		REVISAR

		*/
	}

}