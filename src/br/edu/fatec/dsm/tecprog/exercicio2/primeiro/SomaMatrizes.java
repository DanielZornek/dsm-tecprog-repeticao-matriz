package br.edu.fatec.dsm.tecprog.exercicio2.primeiro;

public class SomaMatrizes {

	public static void main(String[] args) {
		int resultado;
		
		int[][] matrizNumeros = {
			    {1, 2, 3,},
			    {4, 5, 6,},
			    {7, 8, 9}
			};
		
		int[][] matrizNumeros2 = {
			    {9, 8, 7,},
			    {6, 5, 5,},
			    {3, 2, 1}
			};
		
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				resultado = matrizNumeros[i][j] + matrizNumeros2[i][j];
				System.out.println("A soma de "+matrizNumeros[i][j]+" e "+
						matrizNumeros2[i][j]+" resulta em "+resultado);
			}
		}

	}

}
