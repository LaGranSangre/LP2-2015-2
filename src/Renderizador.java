<<<<<<< HEAD

public class Renderizador {
	
	public void mostrarMapa(Mapa m,Personaje p){
		this.clearConsole();
		for(int i=0;i<m.NumFil;i++){
			for(int j=0;j<m.NumCol;j++){
				if(i!=p.posX && j!=p.posY)
					System.out.print(this.impresionCelda(m[i][j]));
				else
					System.out.print("P");
			}
		}
	}

	public char impresionCelda(Celda c){
		return (char)(c.getTipo());
	}
	
	private final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
}
=======

public class Renderizador {
	/*public void mostrarMapa(Mapa m,Personaje p){
		this.clearConsole();
		for(int i=0;i<m.NumFil;i++){
			for(int j=0;j<m.NumCol;j++){
				if(i!=p.posX && j!=p.posY)
					System.out.print(this.impresionCelda(m[i][j]));
				else
					System.out.print(this.impresionCelda('P'));
			}
		}
	}

	public charimpresionCelda
	private final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}*/
}
>>>>>>> origin/master
