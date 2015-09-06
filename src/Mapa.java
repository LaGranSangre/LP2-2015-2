import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Mapa {
	private int numFil;
	private int numCol;
	//private List<List<Celda>> mapa;
	private List<List<String>> lista;
	
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
	
	public Mapa(){ //Constructor de mapa
		//Las dimensiones del mapa son 12*16(12 filas y 16 columnas)
		numFil = 12; 
		numCol = 16;
		
		/*for (List<Celda> list : mapa) {
			for (Celda celda : list) {
				celda.
			}
		}*/
	}
}