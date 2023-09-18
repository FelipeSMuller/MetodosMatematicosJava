package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * Arredondamento para cima de uma lista de números: Crie um programa que recebe
		 * uma lista de números decimais e usa o método Math.ceil() para arredondar cada
		 * número para cima. Em seguida, exiba a lista resultante.
		 */

		Double[] decimais = { Math.random() * 5, Math.random() * 5, Math.random() * 5, Math.random() * 5, };

		for (int i = 0; i < decimais.length; i++) {
			System.out.print(decimais[i] + " ");
		}

		
			String escolhaUsuario;

			escolhaUsuario = JOptionPane.showInputDialog(null, "Deseja continuar para arredondar os valores ? ");

			if (escolhaUsuario != null && escolhaUsuario.equalsIgnoreCase("sim")) {

				for (int i = 0; i < decimais.length; i++) {

					decimais[i] = Math.ceil(decimais[i]);

					System.out.println();

					System.out.print(" " + decimais[i] + " ");
				}

			} else {
				JOptionPane.showMessageDialog(null, " Programa encerrado ");

			}

		} 

	}
