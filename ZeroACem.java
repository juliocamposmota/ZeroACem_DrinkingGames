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
		
		System.out.println("N�mero aleat�rio: " + numeroAleatorio); //temporariamente, para testar a l�gica do programa.
		List<Tentativas> lista = new ArrayList<>();
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Zero a Cem - Drinking Games!");
		System.out.println("Voc� tem 10 tentativas para acertar um n�mero entre 0 e 100.");
		System.out.println("--------------------------------------------------------------\n");
		
		System.out.print("Primeira tentativa: ");
		lista.add(new Tentativas(entrada.nextInt()));
		System.out.println(lista.get(0).toInt()); //verificando se a fun��o para transformar em int e mostrar refer�ncia do index funciona.
		
		
		entrada.close();
	}
}
