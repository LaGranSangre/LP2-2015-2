
public class juego {
	private Personaje cristobal;
	private GestorMapas gestor;
	private Mapa mapa_actual;
	
	
	public juego(){
		cristobal=new Personaje();
		mapa_actual=new Mapa();
		gestor=new GestorMapas();
		//aqui se añade el metodo de gestor que llena el mapa con informacion del archivo
		//de texto		
	}
	
	public static void main(String args[]) {
		juego game=new juego();
		
		} 

}


