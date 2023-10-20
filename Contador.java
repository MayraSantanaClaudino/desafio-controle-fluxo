package domain;
import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Erro: o segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois){
			throw new ParametrosInvalidosException();
		} else {
			int diferencaParametros = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for (int i = 1, i <= diferencaParametros; i++){
				System.out.println("Imprimindo a " + i + "ª interação: " + i);
			}
		}

		public static int lerInteiro (Scanner sc){
			while (true){
				try {
					return Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e){
					System.out.println("Entrada inválida. Digite um número inteiro");
				}
			}
		}
		
	}
}