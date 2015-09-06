import java.util.Scanner;

public class juego {
	private Personaje cristobal;
	private Personaje hermana;
	private GestorMapas gestor;
	private Mapa mapa_actual;
	private InterpreteComandos Interprete;
	
	public juego(){
		cristobal=new Personaje();
		hermana=new Personaje();
		mapa_actual=new Mapa();
		gestor=new GestorMapas();
		Interprete=new InterpreteComandos();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	public void enviar_comando(char comando){
		Interprete.InterpretarAccion(comando, cristobal,hermana, mapa_actual);
	}
	
	public static void main(String args[]) {
		juego game=new juego();
		
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