package aleatorios.drinkgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ZeroACem {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		
		int numeroAleatorio = random.nextInt(100);
		int limiteCima = 100;
		int limiteBaixo = 0;
		int tentativas = 0;
		
		System.out.println("Número aleatório: " + numeroAleatorio); //temporariamente, para testar a lógica do programa.
		List<Tentativas> listaTentativa = new ArrayList<>();
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("P9 - Drinking Games!");
		System.out.println("Zero A Cem - Você tem 05 tentativas para acertar um número entre 0 e 100.");
		System.out.println("--------------------------------------------------------------\n");
		System.out.println("VALENDO!");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Está entre: " + limiteBaixo + " e " + limiteCima);
			System.out.print((i+1) + " tentativa: ");
			listaTentativa.add(new Tentativas(entrada.nextInt()));
			if (listaTentativa.get(i).toInt() >= limiteCima || listaTentativa.get(i).toInt() <= limiteBaixo) {
				System.out.println("Escolha um número ENTRE " + limiteBaixo + " e " + limiteCima + "!");
				System.out.println("Perdeu a rodada, BEBE!");
			}
			if (listaTentativa.get(i).toInt() > numeroAleatorio && listaTentativa.get(i).toInt() < limiteCima) {
				limiteCima = listaTentativa.get(i).toInt();
			} else if(listaTentativa.get(i).toInt() < numeroAleatorio && listaTentativa.get(i).toInt() > limiteBaixo) {
				limiteBaixo = listaTentativa.get(i).toInt();
			}
			if (listaTentativa.get(i).toInt() == numeroAleatorio) {
				System.out.println("Você acertou!! BEBE DESGRAÇA!!");
				break;
			}
			
			tentativas = i + 1;
		}

		if (listaTentativa.get(tentativas).toInt() != numeroAleatorio) {
			System.out.println("Ninguém acertou, TODOS BEBEM!");
		}
		
		entrada.close();
	}
}
