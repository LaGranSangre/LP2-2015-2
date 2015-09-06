import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class GestorMapas {
	private List<String>nombresMapas;
	
	public GestorMapas(){
		for(int i=1;i<=3;i++){
			String nombre = "mapa";
			nombre = nombre + i;
			nombre = nombre + ".txt";
			nombresMapas.add(nombre);
			nombre = "";
		}
	}
	
	public void CargarMapa(Mapa mapa){ //Constructor de mapa
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
				for(int index=0;index<linea.length();index++){
					mapa[fila][index].setCelda(linea.charAt(index));
					mapa[fila][index].setTipo(linea.charAt(index));
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
}
