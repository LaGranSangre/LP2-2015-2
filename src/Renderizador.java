import java.util.Scanner;

public class Renderizador {
	private Celda[][] mapaAMostrar;
	
	public void mostrarMapa(Mapa m,PersonajePrincipal p1,PersonajePrincipal  p2){
		int xC=p1.getPosX(),yC=p1.getPosY();
		int xH=p2.getPosX(),yH=p2.getPosY();
		generarMapaAMostrar(m);
		limpiarPantalla();
		System.out.println("============================");
		System.out.println("MATRIZ DE CARACTERES");
		System.out.println("============================");
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		for(int i=0;i<m.getNumFil();i++){
			for(int j=0;j<m.getNumCol();j++){
				if (j==xC && i==yC)
					System.out.print("A ");
				else if((j==xH && i==yH))
					System.out.print("B ");
				else
					System.out.print(impresionCelda(m.getMapa()[i][j])+" ");
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
	    /*try
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
	    }*/
		for(int i=0;i<25;i++)
			System.out.println("");
	}
	
	public void generarMapaAMostrar(Mapa m){
		int numFil=m.getNumFil();
		int numCol=m.getNumCol();
		mapaAMostrar=new Celda[numFil][numCol];
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++){
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
	

	public void mostrarAccionDuo(int nivel, int posCX, int posHX){
		String clave="";
		switch (nivel){
		case 0:
			clave = "WSIKDDLL";
			break;
		case 1:
			if(posCX==5 && posHX==5)
				clave = "IWOELD";
			else 
				clave = "WUOQEI";
			break;
		case 2:
			clave ="LDOEQUOE";				
			break;
		}
		System.out.println("Presione las teclas: " + clave);
	}
	
	public void mostrarAccionCristobal(){
		System.out.println("Persione las teclas: WDEWW");
	}
	
	public void mostrarHistoria1(){
		limpiarPantalla();
		System.out.println("          Cristóbal y su hermana son pequeños.");
		System.out.println("         Hermana de Cristobal: ¿Para qué servimos?");
		System.out.println("               Cristobal: Seremos valiosos");
		System.out.println("        Hermana de Cristobal: ¿Que te parece si...");
		for(int j=0;j<9;j++)
			for(int i=0;i<1000000000;i++);;
		System.out.println("           ... preguntamos a la llama sabia");
	}

	public void mostrarHistoria2(){
		limpiarPantalla();
	}
	
	public void mostrarHistoria3(){
		limpiarPantalla();
	}
	
	public void mostrarHistoria4(){
		limpiarPantalla();
	}
	
}