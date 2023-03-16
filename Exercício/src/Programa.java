import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		//Declaração das variáveis
		int num;
		Scanner scan=new Scanner(System.in);
		//Leitura de Dados
		System.out.println("Informe um número");
		num=scan.nextInt();
		//Testa se um número é par
		if (num%2==0) {
		    System.out.println("O número informado é par!");
		}
		else {
	    System.out.println("O número informado é ímpar!");
		}

	}

}
