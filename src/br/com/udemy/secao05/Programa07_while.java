package br.com.udemy.secao05;
import java.util.Scanner;

// while
public class Programa07_while {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do teclado via teclado
		Scanner teclado = new Scanner(System.in);

		//Sempre valida o valor antes de executar o bloco
		while(idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //BUG
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos");
			
			teclado.close();
		}
		
	}

}
