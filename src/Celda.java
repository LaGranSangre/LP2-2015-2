public class Celda {
	private char cel;
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		switch(tipo){
		case 'D':  //Terreno duo
			tipo = 1;
			break;
		case 'C':  //Terreno acción
			tipo = 2;
			break;
		case 'S':  //Terreno A
			tipo = 3;
			break;
		case 'N':  //Terreno B
			tipo = 4;
			break;
		case ' ':  //Terreno vacio
			tipo = 5;
			break;
		case 'g': //Obstaculo A: Rocas gigantes
			tipo = 6;
			break;
		case 'n': //Obstaculo B:  Un barranco
			tipo = 7;
			break;
		case 'p': //Paso alto(p) - Terreno Impasable
			tipo = 8;
			break;
		case 'h': //Es un surco o hueco.
			tipo = 9;
			break;
		case 'H': //Hueco o surco grande.(H)
			tipo = 10;
			break;
		}
	}
	
	
}
