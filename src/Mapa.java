import java.io.*;

public class Mapa {
	private int numFil;
	private int numCol;
	private Celda[][] mapa;
	private int nivel;
	
	public int getNumCol() {
		return numCol;
	}
	
	public void setNumCol(int numCol) {
		this.numCol = numCol;
	}
	
	public int getNumFil() {
		return numFil;
	}
	
	public void setNumFil(int numFil) {
		this.numFil = numFil;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}	
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public void setMapa(Celda[][] mapa) {
		this.mapa = mapa;
	}
	
	public Celda ObtenerCelda(int x, int y){
		return getMapa()[x][y];
	}
	
	public Mapa(){ //Crea el mapa con todas las celdas en 0
		numFil = 12;
		numCol = 16;
		setMapa(new Celda[numFil][numCol]);
		for(int i=0;i<numFil;i++){
			//mapa[i] = new Celda[numCol];
			for(int j=0;j<numCol;j++){
				getMapa()[i][j] = new Celda();
				getMapa()[i][j].setCelda('0');
			}
		}
		nivel = 0;
	}
	
	public void MoverCristobal(int viejo_x,int viejo_y,Personaje Cristobal){
		//Asumiendo que solo puede moverse de espacios tipo tipoCelda>=1 && tipoCelda<=4 no se sabe de donde viene el cuy
		//otro atributo del personaje!
		Celda[][] temp=this.getMapa();
				
		//temp[viejo_x][viejo_y].setCelda(Cristobal.getPos_anterior().getCelda());
		temp[viejo_x][viejo_y].setCelda(' ');
		temp[Cristobal.getPosY()][Cristobal.getPosX()].setCelda('A');
	}
	
	
	
	public void MostrarMapa(){
		
		
		System.out.println("============================");
		System.out.println("MATRIZ DE CARACTERES");
		System.out.println("============================");
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++)
				System.out.print(mapa[i][j].getCelda() + " ");
			System.out.println();
		}
		/*System.out.println();
		System.out.println("============================");
		System.out.println("MATRIZ DE TIPOS");
		System.out.println("============================");
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++)
				System.out.print(mapa[i][j].getTipo() + " ");
			System.out.println();
		}*/
	}

}