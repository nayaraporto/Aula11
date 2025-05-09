package Aula11;
import java.util.Scanner;
import java.util.Random;
public class CorridaEspacial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		int estrelas = 0;
	    boolean jogo = true;
			
		System.out.println("Colete as estrelas e desvie dos meteoros ");
		
		while (jogo) {
			System.out.println("Digite 'coletar' para pegar estrelas");
			String acao = ler.next();
			
		
			if (acao.equalsIgnoreCase("coletar")) {
				estrelas++;
				System.out.println("Estrela coletada! Total: " + estrelas);

				if (estrelas % 10 == 0) {
				System.out.println("Meteoro à frente!");

				String direcaoCorreta = random.nextBoolean() ? "esquerda" : "direita";
				String comando;

				do {
				System.out.print("Digite o comando de desvio ('esquerda' ou 'direita'): ");
				comando = ler.next();

				if (!comando.equalsIgnoreCase(direcaoCorreta)) {
				System.out.println("Comando errado! Tente novamente!");
				}
				} while (!comando.equalsIgnoreCase(direcaoCorreta));

				System.out.println("Desvio realizado com sucesso! Continuando a corrida...");
				}
				} else {
				System.out.println("Comando inválido! Digite apenas 'coletar' para continuar.");
				}

				if (estrelas >= 50) {
				System.out.println("Você completou a corrida espacial com " + estrelas + " estrelas!");
				jogo = false;
				}
				}

				ler.close();

	}

}

