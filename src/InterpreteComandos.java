public class InterpreteComandos {
	
	public InterpreteComandos(){	
	}
	
	public void InterpretarAccion(char key, Personaje cristobal, Personaje hermana, Mapa mapa){
		int x, y, tipoCelda, numFil, numCol;
		java.lang.Character.toLowerCase(key);  //cambio el caracter a minusculas
		x = cristobal.getPosX();//posicion de cristobal
		y = cristobal.getPosY();
		numFil = mapa.getNumFil();//limites del mapa
		numCol = mapa.getNumCol();
		switch(key){
		case 'w':	//Mover arriba
			//y--;
			if (y>=1 && y<numFil){
				tipoCelda = mapa.getMapa()[y-1][x].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){	
					--y;
					cristobal.setPosY(y);
					mapa.MoverCristobal(y+1,x , cristobal);
				}
			}
			System.out.print("X: ");
			System.out.print(x);
			System.out.print("Y: ");
			System.out.print(y);
			System.out.print("\n");
			System.out.println("mover arriba");
			break;
		case 's': //Mover abajo
			//y++;
			if (y>=0 && y<numFil-1){
				tipoCelda = mapa.getMapa()[y+1][x].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					y++;
					cristobal.setPosY(y);
					mapa.MoverCristobal(y-1,x, cristobal);
				}
			}
			System.out.print("X: ");
			System.out.print(x);
			System.out.print("Y: ");
			System.out.print(y);
			System.out.print("\n");
			System.out.println("mover abajo");
			break;
		case 'd': //Mover derecha
			//x++;
			if (x>=0 && x<numCol-1){
				tipoCelda = mapa.getMapa()[y][x+1].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					x++;
					cristobal.setPosX(x);
					mapa.MoverCristobal(y,x-1, cristobal);
				}					
			}
			System.out.print("X: ");
			System.out.print(x);
			System.out.print("Y: ");
			System.out.print(y);
			System.out.print("\n");
			System.out.println("mover derecha");
			break;
		case 'a'://Mover izquierda			
			//x--;
			if (x>=1 && x<numCol){
				tipoCelda = mapa.getMapa()[y][x-1].getTipo();
				if (tipoCelda>=1 && tipoCelda<=4){
					x--;
					cristobal.setPosX(x);
					mapa.MoverCristobal(y,x+1,  cristobal);
				}
			}
			System.out.print("X: ");
			System.out.print(x);
			System.out.print("Y: ");
			System.out.print(y);
			System.out.print("\n");
			System.out.println("mover izquierda\n");
			break;
		case 'i':	//Mover arriba
			hermana.setPosY(y+1);
			System.out.println("mover arriba\n");
			break;
		case 'k': //Mover abajo
			hermana.setPosY(y-1);
			System.out.println("mover abajo\n");
			break;
		case 'l': //Mover derecha
			hermana.setPosX(x+1);
			System.out.println("mover derecha\n");
			break;
		case 'j'://Mover izquierda
			hermana.setPosX(x-1);
			System.out.println("mover izquierda\n");
			break;
		}
	}
	public void InterpretarComandoEspecial(String key, String comando, Personaje personaje, Mapa mapa){
		if (comando.compareTo(key)==0){
			//ejecuta movimiento especial
		}
	}
}