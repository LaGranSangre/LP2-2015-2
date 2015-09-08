import java.util.Scanner;

public class InterpreteComandos {
	
	public InterpreteComandos(){	
	}
	
	public void revisarTrigger(Mapa mapa,int x,int y){	
		//Celda temp=mapa.getMapa()[x][y];
		if(mapa.getMapa()[y][x].getCelda()=='T'){
			for(int i=0;i<mapa.getNumFil();++i) 
				if(mapa.getMapa()[i][x].getCelda()=='T')
					mapa.getMapa()[i][x].setCelda('N');				
			mapa.setEnemigo(true);
		}
	}
	
	public void InterpretarAccion(char key, PersonajePrincipal cristobal, PersonajePrincipal hermana, Mapa mapa){
		int x, y, xH, yH, tipoCelda, numFil, numCol;
		java.lang.Character.toLowerCase(key);  //cambio el caracter a minusculas
		//POSICION DE CRISTOBAL
		x = cristobal.getPosX();//posicion de cristobal
		y = cristobal.getPosY();
		//POSICION DE HERMANA
		xH = hermana.getPosX();
		yH = hermana.getPosY();
		
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
					//mapa.MoverCristobal(y+1,x , cristobal);
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
					//mapa.MoverCristobal(y-1,x, cristobal);
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
					//mapa.MoverCristobal(y,x-1, cristobal);
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
					//mapa.MoverCristobal(y,x+1,  cristobal);
				}
			}			
			System.out.print("X: ");
			System.out.print(x);
			System.out.print("Y: ");
			System.out.print(y);
			System.out.print("\n");
			System.out.println("mover izquierda\n");
			break;
		
			//MOVER HERMANA
					case 'i':	//Mover arriba
						//y--;
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (yH>=1 && yH<numFil){
							tipoCelda = mapa.getMapa()[yH-1][xH].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){	
								--yH;
								hermana.setPosY(yH);
								//mapa.MoverHermana(yH+1,xH , hermana);
							}
						}
						revisarTrigger(mapa, xH, yH);
						System.out.print("X: ");
						System.out.print(xH);
						System.out.print("Y: ");
						System.out.print(yH);
						System.out.print("\n");
						System.out.println("mover arriba");
						break;
					case 'k': //Mover abajo
						//y++;
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (yH>=0 && yH<numFil-1){
							tipoCelda = mapa.getMapa()[yH+1][xH].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								yH++;
								hermana.setPosY(yH);
								//mapa.MoverHermana(yH-1,xH, hermana);
							}
						}
						revisarTrigger(mapa, xH, yH);
						System.out.print("X: ");
						System.out.print(xH);
						System.out.print("Y: ");
						System.out.print(yH);
						System.out.print("\n");
						System.out.println("mover abajo");
						break;
					case 'l': //Mover derecha
						//x++;
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (xH>=0 && xH<numCol-1){
							tipoCelda = mapa.getMapa()[yH][xH+1].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								xH++;
								hermana.setPosX(xH);
								//mapa.MoverHermana(yH,xH-1, hermana);
							}					
						}
						revisarTrigger(mapa, xH, yH);
						System.out.print("X: ");
						System.out.print(xH);
						System.out.print("Y: ");
						System.out.print(yH);
						System.out.print("\n");
						System.out.println("mover derecha");
						break;
					case 'j'://Mover izquierda			
						//x--;
						if(mapa.isEnemigo()==true){
							hermana.reducir_vida_movimiento();
							break;
						}
						if (xH>=1 && xH<numCol){
							tipoCelda = mapa.getMapa()[yH][xH-1].getTipo();
							if (tipoCelda>=1 && tipoCelda<=4){
								xH--;
								hermana.setPosX(xH);
								//mapa.MoverHermana(yH, xH+1, hermana);
							}
						}
						revisarTrigger(mapa, xH, yH);
						System.out.print("X: ");
						System.out.print(xH);
						System.out.print("Y: ");
						System.out.print(yH);
						System.out.print("\n");
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