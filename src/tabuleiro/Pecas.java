package tabuleiro;

public class Pecas {

	protected Posicao posicao;
	private   Borda   borda;
	
	public Pecas(Borda borda) {
		this.borda = borda;
		posicao    = null;
	}
	
	protected Borda getBoard() {
		return this.borda;
	}
}

