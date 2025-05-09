package Aula11;
import java.util.Scanner;
public class SuperheroidaContagem {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o número até qual você que contar");
		int numeroFinal = ler.nextInt();
		int contador = 1;
		
		do {
			System.out.println("Contando: " + contador);

		if (contador % 10 == 0) {
			System.out.print("ARMADILHA Digite o código da armadilha para continuar: ");
			String codigo = ler.next();
			if (!codigo.equals("1234")) {
				System.out.println("Código errado, Você falhou");
				break;
			}
		}
		contador++;
		}while (contador <= numeroFinal);
		
		if (contador > numeroFinal) {
			System.out.println("Você salvou a cidade");
		}
		
		ler.close();
		
		
		
		
		
		
	}

}
