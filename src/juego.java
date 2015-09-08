import java.util.Scanner;

public class juego {
	private static Personaje cristobal;
	private static Personaje hermana;
	private GestorMapas gestor;
	private Mapa mapa_actual;
	private InterpreteComandos Interprete;
	private Renderizador Rend;
	
	public juego(){
		cristobal=new Personaje();
		hermana=new Personaje();
		gestor=new GestorMapas();
		mapa_actual=new Mapa();
		gestor.CargarMapa(mapa_actual, cristobal,hermana);//carga el mapa inicial
		Interprete=new InterpreteComandos();
		Rend=new Renderizador();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	public int PantallaInicio(){
		return Rend.PantallaInicio();
	}
	
	public void AccionDuo(Mapa mapaActual){
		int tipoMapa = mapaActual.getNivel();
		switch (tipoMapa){
		case 1:
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
						
			//cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()-1);		
			//hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
						
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
						
			cristobal.setPosX(cristobal.getPosX()+3); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+3); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
						
			cristobal.setPosX(cristobal.getPosX()+1); 
			//cristobal.setPosY(cristobal.getPosY()-1);		
			hermana.setPosX(hermana.getPosX()+1); 
			//hermana.setPosY(hermana.getPosY()+1);	
			
			Rend.mostrarMapa(mapa_actual, cristobal, hermana);//se muestra el mapa luego de cada cambio
						
			cristobal.setPosX(cristobal.getPosX()-1); 
			cristobal.setPosY(cristobal.getPosY()+2);		
			hermana.setPosX(hermana.getPosX()-1); 
			hermana.setPosY(hermana.getPosY()-2);	
						
		}
	}
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal,hermana, mapa_actual);
	}


	public static void main(String args[]) {
		//Holaaa ptmr ya carga mapas!!!!!
		//Holaaa ptmr ya carga mapas!!!!!
		//Holaaa ptmr ya carga mapas!!!!!
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
			System.out.print(posCX + posCY + posHX + posHY);
			
			game.Rend.mostrarMapa(game.mapa_actual,cristobal,hermana);
			
			int tipoCeldaH = game.mapa_actual.getMapa()[posHX][posHY].getTipo(), tipoCeldaC = game.mapa_actual.getMapa()[posCX][posCY].getTipo();  
			
			if(tipoCeldaC==1 && tipoCeldaH==1){ //tipo 1 : 'D'
				game.AccionDuo(game.mapa_actual);
			}
			
			
				
			String str = s.nextLine();
			if(str.length()==1 ){						
				game.enviar_comando(str.charAt(0));				
			}
		}
	}
}
