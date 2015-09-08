import java.util.Scanner;

public class Renderizador {
	private Celda[][] mapaAMostrar;
	public void mostrarMapa(Mapa m,Personaje p1,Personaje p2){
		int xC=p1.getPosX(),yC=p1.getPosY();
		int xH=p2.getPosX(),yH=p2.getPosY();
		generarMapaAMostrar(m);
		limpiarPantalla();
		System.out.println("============================");
		System.out.println("MATRIZ DE CARACTERES");
		System.out.println("============================");
		for(int i=0;i<m.getNumFil();i++){
			for(int j=0;j<m.getNumCol();j++){
				if (j==xC && i==yC)
					System.out.print("A ");
				else if((j==xH && i==yH))
					System.out.print("B ");
				else
					System.out.print(this.impresionCelda(mapaAMostrar[j][i]));
			}
			System.out.println();
		}
		/*System.out.println();
		System.out.println("============================");
		System.out.println("MATRIZ DE TIPOS");
		System.out.println("============================");
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++)
				System.out.print(mapa[i][j].getTipo() + " ");
			System.out.println();
		}*/
	}	

	public char impresionCelda(Celda c){
		return (char)(c.getCelda());
	}
	
	private final static void limpiarPantalla()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	public void generarMapaAMostrar(Mapa m){
		for(int i=0;i<m.getNumFil();i++){
			for(int j=0;j<m.getNumCol();j++){
				mapaAMostrar[i][j]=m.getMapa()[i][j];
			}
		}
	}
	
	public int PantallaInicio(){
		char opcion;
		//Muestra bienvenida
		System.out.println("*********Bienvenido al Juego*********");
		System.out.println("*********El Valioso Cristobal*********");
		System.out.println("\n\nPulse cualquier tecla para continuar....");
		//Se lee cualquier entrada para continuar
		//AQUI HAY QUE CORREGIR TMB PARA QUE SE APRETE SIN ENTER.
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
}