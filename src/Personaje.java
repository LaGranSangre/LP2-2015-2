
public class Personaje {
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
	
}

class Enemigo extends Personaje{
	
}

