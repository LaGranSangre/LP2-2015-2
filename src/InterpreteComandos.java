public class InterpreteComandos {
	
	public InterpreteComandos(){	
	}
	
	public void InterpretarAccion(char key, Personaje personaje, Mapa mapa){
		int x, y;
		java.lang.Character.toLowerCase(key);  //cambio el caracter a minusculas
		x = personaje.getPosX();
		y = personaje.getPosY();
		switch(key){
		case 'w':	//Mover arriba
			personaje.setPosY(y+1);
			break;
		case 's': //Mover abajo
			personaje.setPosY(y-1);
			break;
		case 'd': //Mover derecha
			personaje.setPosX(x+1);
			break;
		case 'a'://Mover izquierda
			personaje.setPosX(x-1);
			break;		
		}
	}
	public void InterpretarComandoEspecial(String key, String comando, Personaje personaje, Mapa mapa){
		if (comando.compareTo(key)==0){
			//ejecuta movimiento especial
		}
	}
}