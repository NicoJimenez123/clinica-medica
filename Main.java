import java.util.Scanner;

public class Main {
	public static Scanner s;
	public static SistemaInterno sI;
	public Main() {
	}
	public static void main(String[] args) {
		s = new Scanner(System.in);
		sI = new SistemaInterno();
		menu();
	}
	
	public static void menu() {
		while(true) {
			System.out.println("Opcion 1) Login.");
			System.out.println("Opcion 2) Registrar un Administrador.");
			System.out.print("Ingrese una Opción: ");
			int opc = s.nextInt();
			switch(opc) {
			case 1: pantallaLogin();break;
			case 2: registrarAdmin();break;
			default: System.out.println("Opción no Valida");
			}
		}
	}
	public static void pantallaLogin() {
		System.out.println("\nIngrese el nombre de usuario: ");
		String user = s.next();
		System.out.println("\nIngrese la constraseña: ");
		String pass = s.next();
		System.out.println(sI.loginAdmin(user, pass));
	}
	public static void registrarAdmin() {
		System.out.println("\nIngrese el nombre de usuario: ");
		String user = s.next();
		System.out.println("\nIngrese la constraseña: ");
		String pass = s.next();
		System.out.println("\n¿Es un Administrador de Sistemas?: ");
		boolean esSistemas = s.nextBoolean();
		sI.registrarAdmin(user, pass, esSistemas);
		//db.verUsuarios();
		//System.out.println(db.esDeSistemas("nico"));
	}
}
