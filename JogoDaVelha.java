package aula;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String [][] jogador = new String[3][3];
		
		int[][] numeros = { { 1, 2, 3}, { 4, 5, 6}, {7, 8, 9}};

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int contadora = 0; contadora < jogador.length; contadora++) {
			for (int contadora2 = 0; contadora2 < jogador[contadora].length; contadora2++) {
				System.out.println("Informe quem irá jogar na "+numeros[contadora][contadora2]+"º posição: ");
				jogador[contadora][contadora2] = sc.next();
				if ((jogador[contadora][contadora2].equalsIgnoreCase("X") ) || (jogador[contadora][contadora2].equalsIgnoreCase("O"))) {
					
				} else {
					System.out.println("Só pode digitar X ou O, informe novamente");
					jogador[contadora][contadora2] = sc.next();
				}
			}
		}
		
		for (int x = 0; x < jogador.length; x++) {
			for (int y = 0; y < jogador[x].length; y++) {
				System.out.print(jogador[x][y]+" ");
			}
			System.out.println();
		}
		
		if (jogador[0][0].equalsIgnoreCase("x") && jogador[1][0].equalsIgnoreCase("x") && jogador[2][0].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][1].equalsIgnoreCase("x") && jogador[1][1].equalsIgnoreCase("x") && jogador[2][1].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][2].equalsIgnoreCase("x") && jogador[1][2].equalsIgnoreCase("x") && jogador[2][2].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][0].equalsIgnoreCase("x") && jogador[0][1].equalsIgnoreCase("x") && jogador[0][2].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[1][0].equalsIgnoreCase("x") && jogador[1][1].equalsIgnoreCase("x") && jogador[1][2].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[2][0].equalsIgnoreCase("x") && jogador[2][1].equalsIgnoreCase("x") && jogador[2][2].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][0].equalsIgnoreCase("x") && jogador[1][1].equalsIgnoreCase("x") && jogador[2][2].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][2].equalsIgnoreCase("x") && jogador[1][1].equalsIgnoreCase("x") && jogador[2][0].equalsIgnoreCase("x")) {
			System.out.println("O jogador com o X ganhou !!");
		} else if (jogador[0][0].equalsIgnoreCase("o") && jogador[1][0].equalsIgnoreCase("o") && jogador[2][0].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[0][1].equalsIgnoreCase("o") && jogador[1][1].equalsIgnoreCase("o") && jogador[2][1].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[0][2].equalsIgnoreCase("o") && jogador[1][2].equalsIgnoreCase("o") && jogador[2][2].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[0][0].equalsIgnoreCase("o") && jogador[0][1].equalsIgnoreCase("o") && jogador[0][2].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[1][0].equalsIgnoreCase("o") && jogador[1][1].equalsIgnoreCase("o") && jogador[1][2].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[2][0].equalsIgnoreCase("o") && jogador[2][1].equalsIgnoreCase("o") && jogador[2][2].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[0][0].equalsIgnoreCase("o") && jogador[1][1].equalsIgnoreCase("o") && jogador[2][2].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else if (jogador[0][2].equalsIgnoreCase("o") && jogador[1][1].equalsIgnoreCase("o") && jogador[2][0].equalsIgnoreCase("o")) {
			System.out.println("O jogador com o O ganhou !!");
		} else {
			System.out.println("Deu velha");
		}
		
		
		
		
		sc.close();
	}

}
