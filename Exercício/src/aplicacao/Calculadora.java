package aplicacao;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int continuar;
		do {
		System.out.println("Digite um número");
		double n1 = sc.nextDouble();
		System.out.println("Digite outro número");
		double n2 = sc.nextDouble();
		System.out.println("Digite a opeção: ( +, -, *, /)");
		char op = sc.next().charAt(0);
		double resultado;
		switch (op) {
		case '+': resultado = n1 + n2;
		System.out.println("A soma = " + resultado);
		break;
		case '-':
			resultado = n1 - n2;
			System.out.println("A subtração = " + resultado);
			break;
		case '*':
			resultado = n1 * n2;
			System.out.println("A multiplicação = " + resultado);
			break;
		case '/':
			if (n2 == 0) {
				System.out.println("Divisão por zero");
			}
			else {
				
			}
			resultado = n1 / n2;
			System.out.println("A divisão = + resultado");
			break;
			default:
				System.out.println("Operador inválido");
				break;
		} 
		System.out.println("Continuar? (1)sim (2)não:");
		continuar = sc.nextInt();
		}  while (continuar == 1);
		
		

	}

}
