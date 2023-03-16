import java.util.Scanner;
public class Exércicio3 {
	public static void main(String[] args) {
		//Declaração das variáveis
		int num1,num2,num3,menor;
		Scanner scan=new Scanner(System.in);
		//Leitura de dados
		System.out.println("Informe o primeiro número");
		num1=scan.nextInt();
		System.out.println("Informe o segundo número");
		num2=scan.nextInt();
		System.out.println("Informe o terceiro número");
		num3=scan.nextInt();
		//Acha o menor número
		if (num1<num2 && num1<num3) {
			menor=num1;
			}
		else {
			if(num2<num3) {
				menor=num2;
				}
			else {
				menor=num3;
			}
			System.out.println("O menor número informado é"+num3);
		}
		}

}
