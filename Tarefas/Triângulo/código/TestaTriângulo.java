package código;

import java.util.Scanner;

public class TestaTriângulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Triângulo triângulo = new Triângulo();
		double lados[] = new double[3], lados2[] = new double[3];
		
		//Entra com os lados do triângulo
		for(int i =0; i<lados.length;i++) {
			System.out.print("Entre com o " + (i+1) + " lado do triângulo: ");
			lados[i] = entrada.nextDouble();
		}
		triângulo.setA(lados[0]);
		triângulo.setB(lados[1]);
		triângulo.setC(lados[2]);
		
		//Imprime os lados do triângulo
		lados2[0] = triângulo.getA();
		lados2[1] = triângulo.getB();
		lados2[2] = triângulo.getC();
		for(int i =0; i<lados2.length;i++) 
			System.out.println("O lado " + (i+1) + " do triângulo eh: " + lados2[i]);
		
		//Modificando os lados
		triângulo.setA(lados[0]);
		triângulo.setB(lados[0]);
		triângulo.setC(lados[0]);
		
		//Imprime os lados do triângulo de novo
		lados2[0] = triângulo.getA();
		lados2[1] = triângulo.getB();
		lados2[2] = triângulo.getC();
		System.out.println("\nOs novos lados do triângulo são: ");
		for(int i =0; i<lados2.length;i++) 
			System.out.println("O lado " + (i+1) + " do triângulo eh: " + lados2[i]);
		
		//Qual o tipo do triângulo?
		String tipo = new String();
		tipo =  triângulo.tipo();
		System.out.println("\nO tipo do triângulo eh: " + tipo);
		
		
		
		entrada.close();
	}

}
