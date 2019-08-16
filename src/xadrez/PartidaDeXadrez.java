package xadrez;

import tabuleiro.Borda;

public class PartidaDeXadrez {
	
	private Borda borda;
	
	public PartidaDeXadrez() {
		borda = new Borda(8, 8);
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[borda.getLinhas()][borda.getColunas()];
		for(int i=0; i<borda.getLinhas(); i++) {
			for(int j=0; j<borda.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) borda.pecas(i, j);
			}
		}
		
		return mat;
	}
}
