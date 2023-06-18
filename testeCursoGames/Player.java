package testeCursoGames;

public class Player {
	public int vida = 10;
	public String nome = "Jão";
	
	public void perderVida() {
		vida--;
	}
	
	public void ganharVida() {
		vida++;
	}
}
