import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double valor1;
		double valor2;
		double soma, subtracao, multiplicacao, divisao;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Este programa vai somar, subtrair, multiplar e dividir os valores que você digitar");
		System.out.println("Por favor, digite o primeiro valor:");
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, digite o segundo valor:");
		valor2 = leitor.nextDouble();
		leitor.close();
		soma = valor1 + valor2;
		System.out.println("A soma entre os dois valores é " + soma);
		subtracao = valor1 - valor2;
		System.out.println("A subtração entre os dois valores é " + subtracao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicação entre os dois valores é " + multiplicacao);
		divisao = valor1 / valor2;
		System.out.println("A divisão entre os dois valores é " + divisao);
	}

}
