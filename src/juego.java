import java.util.Scanner;

public class juego {
	private static PersonajePrincipal cristobal;
	private static PersonajePrincipal hermana;
	private GestorMapas gestor;
	private Mapa mapa_actual;
	private InterpreteComandos Interprete;
	private Renderizador Rend;
	
	public juego(){
		cristobal=new PersonajePrincipal();
		hermana=new PersonajePrincipal();
		gestor=new GestorMapas();
		mapa_actual=new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal,hermana);//carga el mapa inicial
		Interprete=new InterpreteComandos();
		Rend=new Renderizador();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	public int PantallaInicio(){
		Rend.mostrarHistoria1();
		return Rend.PantallaInicio();
	}
	
	public void AccionDuo(Mapa mapaActual){
		int tipoMapa = mapaActual.getNivel();
		Scanner s = new Scanner(System.in);	
		String str;
				
		switch (tipoMapa){
		case 0:
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			//cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();		
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+3); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+3); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()+2);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()-2);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			break;
		
		case 1:
			if(cristobal.getPosX()==5 && hermana.getPosX()==5){
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
									
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+2); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+2); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()+2);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()-2);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
			}
			else{
				//cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-1);		
				//hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
									
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()-1); 
				cristobal.setPosY(cristobal.getPosY()-2);		
				hermana.setPosX(hermana.getPosX()-1); 
				hermana.setPosY(hermana.getPosY()-2);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosX(cristobal.getPosX()+1); 
				//cristobal.setPosY(cristobal.getPosY()-1);		
				hermana.setPosX(hermana.getPosX()+1); 
				//hermana.setPosY(hermana.getPosY()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				 
				cristobal.setPosY(cristobal.getPosY()-1);						
				hermana.setPosY(hermana.getPosY()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()-1);						
				hermana.setPosY(hermana.getPosY()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()-3);
				cristobal.setPosX(cristobal.getPosX()+1);
				hermana.setPosY(hermana.getPosY()-3);
				hermana.setPosX(hermana.getPosX()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				
				cristobal.setPosX(cristobal.getPosX()+1);				
				hermana.setPosX(hermana.getPosX()+1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
				
				cristobal.setPosY(cristobal.getPosY()+2);
				cristobal.setPosX(cristobal.getPosX()-1);
				hermana.setPosY(hermana.getPosY()-2);
				hermana.setPosX(hermana.getPosX()-1);	
				
				Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
				str = s.nextLine();
			}
			break;
			
		case 2:
			//cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();		
			
			cristobal.setPosX(cristobal.getPosX()+3); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+3); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
			mapa_actual.EliminaRata();
			
			//cristobal.setPosX(cristobal.getPosX()+3); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()+3); 
			hermana.setPosY(hermana.getPosY()-1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
			str = s.nextLine();
			
		
		}
	}
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal,hermana, mapa_actual);
	}


	public boolean VerificarAccionDuo(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();		
		String clave="";
		int nivel = mapa_actual.getNivel();
		switch (nivel){
			case 0:
				clave = "WSIKDDLL";
				break;
			case 1:
				if(cristobal.getPosX()==5 && hermana.getPosX()==5)
					clave = "IWOELD";
				else 
					clave = "WUOQEI";
				break;
			case 2:
				clave ="LDOEQUOE";				
				break;
		}
		return (str.equals(clave));
	}
	
	public static void main(String args[]) {
		
		juego game=new juego();
		/*Mapa m = new Mapa();		
		GestorMapas gm = new GestorMapas();
		
		m.MostrarMapa();
		m.setNivel(2);
		gm.CargarMapa(m, cristobal);
		m.MostrarMapa();*/
		
		int opcion;
		if(game.PantallaInicio()==0) //Salir del juego
			return;

		
		Scanner s = new Scanner(System.in);		
		while(true){
			int posCX = cristobal.getPosX(), posCY = cristobal.getPosY(), posHX = hermana.getPosX(), posHY = hermana.getPosY();
			
			game.Rend.mostrarMapa(game.mapa_actual,cristobal,hermana);
			
			int tipoCeldaH = game.mapa_actual.getMapa()[posHY][posHX].getTipo(), tipoCeldaC = game.mapa_actual.getMapa()[posCY][posCX].getTipo();  
			
			if(tipoCeldaC==1 && tipoCeldaH==1){ //tipo 1 : 'D'
				while(true){
					game.Rend.mostrarAccionDuo();
					if(game.VerificarAccionDuo()){
						game.AccionDuo(game.mapa_actual);
						break;
					}
				}
			}
			
			//Si llega al final del nivel
			if((posCX==(game.mapa_actual.getNumCol()-1)) && (posHX==posCX)){							
				game.mapa_actual.setNivel(game.mapa_actual.getNivel()+1);
				game.gestor.CargarMapa(game.mapa_actual, cristobal,hermana);//carga el mapa siguiente
				game.Rend.mostrarMapa(game.mapa_actual, cristobal, hermana);
			}
				
			String str = s.nextLine();
			if(str.length()==1 ){						
				game.enviar_comando(str.charAt(0));				
			}
		}
	}
}
