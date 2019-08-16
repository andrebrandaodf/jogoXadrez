package xadrez;

import tabuleiro.Pecas;
import tabuleiro.Borda;

public class PecaDeXadrez extends Pecas {

	private Cor cor;
	
	public PecaDeXadrez(Borda borda, Cor cor) {
		super(borda);
		this.cor = cor;
	}
	
	public Cor getCor() {
		return this.cor;
	}
	
}
