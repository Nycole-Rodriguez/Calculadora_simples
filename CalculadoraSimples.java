package calculadora_simples;

import java.util.Scanner;
public class CalculadoraSimples{

public static void main(String[] args) {
	
	int n1=0;
	int n2=0;
	int soma=0;
	
	String  operacao = "";
	int control=0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("digite o primeiro numero: ");
	n1 = entrada.nextInt();
	
	System.out.println("Digite o segundo numero: ");
	n2 = entrada.nextInt();
	
	soma = n1+n2;
	
	System.out.printf("A soma é %d\n", soma); 
	
	
}	
}
	
	