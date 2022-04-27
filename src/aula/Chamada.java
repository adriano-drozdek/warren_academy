package aula;

import java.util.Scanner;

public class Chamada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Lista de chamada. ");
		System.out.println("Ana / Carlos / João / Maria / Pedro ");
		System.out.println();
		System.out.print("Informe quantos alunos chegaram no horário: ");
		int tempoChegada  = sc.nextInt();

		if (tempoChegada  < 3) {
			System.out.println("Aula cancelada! ");
		} 
		else {
			System.out.println("Aula normal! ");
		}

		sc.close();
	}

}
