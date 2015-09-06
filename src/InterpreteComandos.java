public class InterpreteComandos {
	
	public InterpreteComandos(){	
	}
	
	public void InterpretarAccion(char key, Personaje personaje, Mapa mapa){
		java.lang.Character.toLowerCase(key);
		switch(key){
		case 'W':	//Mover arriba
			//personaje.MoverArriba();
			break;
		case 'S': //Mover abajo
			//personaje.MoverAbajo()
			break;
		case 'D': //Mover derecha
			//personaje.MoverDerecha()
			break;
		case 'A'://Mover izquierda
			//personaje.MoverIzquierda()
			break;		
		}
	}
	public void InterpretarComandoEspecial(String key, String comando, Personaje personaje, Mapa mapa){
		if (comando.compareTo(key)==0){
			//ejecuta movimiento especial
		}
	}
}