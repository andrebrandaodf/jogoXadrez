package application;

import xadrez.PecaDeXadrez;

public class UI {

	public static void printBorda(PecaDeXadrez[][] pecas) {
		for(int i=0; i<pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j=0; j<pecas.length; j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  ABCDEFGH");
	}
	
	private static void printPeca(PecaDeXadrez peca) {
		if(peca == null) {
			System.out.println("-");
		}
		else {
			System.out.print(peca);
		}	
		System.out.println(" ");
	}
}
