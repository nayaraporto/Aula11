package Aula11;
import java.util.Random;
import java.util.Scanner;
public class AdivinhaçãodoNumeroSecreto {

	public static void main(String[] args) {
		Random random = new Random ();
		Scanner ler = new Scanner (System.in);
		
		int num = random.nextInt(100)+1;
		int tentativa;
		int tentativas = 0;
		
		System.out.println(" Bem-Vindo ao jogo de Adivinhação");
		System.out.println("Adivinhe o número entre 1 e 100: ");
		System.out.println("Tente adivinhar");
		
		while (true) {
			System.out.println("Digite seu Palpite: ");
			tentativa = ler .nextInt();
			tentativas++;
			
		if (tentativa > num) {
			System.out.println("Errado, o número é menor");
			
		} else if (tentativa < num) {
			System.out.println("Errado, o núemro é maior");
		} else {
			System.out.println("Acertou, o número era:" + num);
			System.out.println("Você acertou em " + tentativas + "tentativas");
			break; 
		}
		}
		
		ler.close();
	

	}

}

