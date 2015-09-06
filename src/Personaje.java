
public class Personaje {
	private String nombre;
	private int posX;
	private int posY;
	
	public Personaje(){
		
	}
	
	public Personaje(int posX, int posY){
		this.setPosX(posX);
		this.setPosY(posY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void Imprimir(){
		System.out.println("Nombre: " + getNombre() + " PosX: " + getPosX() + " PosY: " + getPosY());
	}

	
}

class PersonajePrincipal extends Personaje{
	private static int vida = 10;
	
	public PersonajePrincipal(){
		
	}
	
	private static int getVida() {
		return vida;
	}

	private static void setVida(int vida) {
		PersonajePrincipal.vida = vida;
	}
	
	public void Imprimir(){
		System.out.println(vida);
		super.Imprimir();
	}
	
}

class Enemigo extends Personaje{
	public Enemigo(){
		
	}

	public void Imprimir(){
		super.Imprimir();
	}
}

