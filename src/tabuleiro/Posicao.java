package tabuleiro;

public class Posicao {

	private int linha;
	private int coluna;
	
	public Posicao(int linha, int coluna) {
		this.linha  = linha;
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return this.linha;
	}
	public void getColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public int setLinha() {
		return this.linha;
	}
	public void setColuna() {
		this.coluna = coluna;
	}
	
	@Override
	public String toString() {
		return linha + ", "+coluna;
	}
}
