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
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal, mapa_actual);
	}
	
	public static void main(String args[]) {
		juego game=new juego();
		char opcion;
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


