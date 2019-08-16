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
	public int getColunas() {
		return this.colunas;
	}
	
	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	@Override
	public String toString() {
		return linhas + ", "+colunas;
	}
}
