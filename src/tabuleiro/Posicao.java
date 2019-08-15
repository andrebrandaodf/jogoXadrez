package tabuleiro;

public class Posicao {

	private int linhas;
	private int colunas;
	
	public Posicao(int linhas, int colunas) {
		this.linhas  = linhas;
		this.colunas = colunas;
	}
	
	public int getLinhas() {
		return this.linhas;
	}
	public void getColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public int setLinhas() {
		return this.linhas;
	}
	public void setColunas() {
		this.colunas = colunas;
	}
	
	@Override
	public String toString() {
		return linhas + ", "+colunas;
	}
}
