import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		//Declaração das variáveis
		int num1,num2; //Dois números inreiros 
		int menor; //O menor número
		Scanner scan=new Scanner(System.in);
		//Leitura dos dados
		System.out.println("Informe um número");
		num1=scan.nextInt();
		System.out.println("Informe outro número");
		num2=scan.nextInt();
		//Acha o menor número
		if (num1<num2) {
			menor=num1;
			}
		else { 
			menor=num2;
		}
		System.out.println("O menor número é"+menor);
		}

}
