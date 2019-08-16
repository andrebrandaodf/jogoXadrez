package tabuleiro;

public class Borda {

	private int       linhas;
	private int       colunas;
	private Pecas[][] pecas;
	
	public Borda(int linhas, int colunas) {
		this.linhas  = linhas;
		this.colunas = colunas;
		pecas = new Pecas[linhas][colunas];
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
	
	public Pecas pecas(int linha, int coluna) {
		return pecas[linha][coluna]; 
	}
	public Pecas pecas(Posicao posicao) {
		return pecas[posicao.getLinhas()][posicao.getColunas()];
	}
}
