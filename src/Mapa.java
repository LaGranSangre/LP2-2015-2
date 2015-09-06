import java.io.*;

public class Mapa {
	private int numFil;
	private int numCol;
	private Celda[][] mapa;
	
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
	
	public Mapa(){ //Crea el mapa con todas las celdas en 0
		numFil = 12;
		numCol = 16;
		mapa = new Celda[numFil][numCol];
		for(int i=0;i<numFil;i++){
			//mapa[i] = new Celda[numCol];
			for(int j=0;j<numCol;j++){
				mapa[i][j] = new Celda();
				mapa[i][j].setCelda('0');
			}
		}
	}
	
	public void CargarMapa(String nombreMapa){ //Constructor de mapa
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		try{
			archivo =  new File(nombreMapa);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			//Lectura del archivo de texto
			String linea;
			int fila = 0;
			while((linea=br.readLine())!=null){
				for(int j=0;j<numCol;j++){
					for(int index=0;index<linea.length();index++)
						mapa[fila][j].setTipo(linea.charAt(index));
				}
				fila++;
			}
		}catch(Exception e){
	         e.printStackTrace();
		}finally{
	        // En el finally cerramos el fichero, para asegurarnos
	        // que se cierra tanto si todo va bien como si salta 
	        // una excepcion.
	        try{                    
	           if( null != fr ){   
	              fr.close();     
	           }                  
	        }catch (Exception e2){ 
	           e2.printStackTrace();
	        }
	   }
	}
	
	public void MostrarMapa(Mapa m){
		for(int i=0;i<numFil;i++){
			for(int j=0;j<numCol;j++)
				System.out.println(mapa[i][j].getTipo());
			System.out.println();
		}
	}	
}