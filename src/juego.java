import java.util.Scanner;

public class juego {
	private Personaje cristobal;
	private GestorMapas gestor;
	private Mapa mapa_actual;
	private InterpreteComandos Interprete;
	
	public juego(){
		cristobal=new Personaje();
		mapa_actual=new Mapa();
		gestor=new GestorMapas();
		Interprete=new InterpreteComandos();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	public int PantallaInicio(){
		char opcion;
		//Muestra bienvenida
		System.out.println("*********Bienvenido al Juego*********");
		System.out.println("*********El Valioso Cristobal*********");
		System.out.println("\n\nPulse cualquier tecla para continuar....");
		//Se lee cualquier entrada para continuar
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		while(true){
			//Muestra bienvenida
			System.out.println("Ingrese una de las siguientes opciones:");
			System.out.println("(a) Iniciar Juego");
			System.out.println("(b) Salir");
			//lee la opcion ingresada
			str = s.nextLine();
			if(str.length()==1 ){ //Si se ingreso un caracter			
				opcion = str.charAt(0);
				java.lang.Character.toLowerCase(opcion);
				if (opcion=='a')
					return 1;
				if (opcion=='b'){
					while(true){
						System.out.println("¿Está seguro de que desea salir del juego?");
						System.out.println("[Y/N] (Y: Sí, N: No)");
						str = s.nextLine();
						if(str.length()==1 ){
							opcion = str.charAt(0);
							java.lang.Character.toLowerCase(opcion);
							if(opcion=='y')
								return 0;
							if(opcion=='n')
								break;											
							}
						System.out.println("La opción ingresada no es válida");
						}
					}
				else
					System.out.println("La opción ingresada no es válida");
				}
			else		
				System.out.println("La opción ingresada no es válida");
			}
		}
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal, mapa_actual);
	}

	public static void main(String args[]) {
		juego game=new juego();
		Mapa m = new Mapa();
		
		m.MostrarMapa(m);
		
		int opcion;
		
		if(game.PantallaInicio()==0) //Salir del juego
			return;
		
		Scanner s = new Scanner(System.in);		
		while(true){
			String str = s.nextLine();
			if(str.length()==1 ){
				//System.out.println("Si imprime");
				game.enviar_comando(str.charAt(0));				
			}			
		}
	} 

}


