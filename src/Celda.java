public class Celda {
	private char cel;
	private int tipo;

	private int getTipo() {
		return tipo;
	}

	private void setTipo(int tipo) {
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
		}
	}
	
	
}
