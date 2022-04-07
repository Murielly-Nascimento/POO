package código;

import java.util.Scanner;

public class TestaPedido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double custo = 15;			//O custo de qualquer prato é 15
		double precoVenda = 30;		//O preço dele é 30
		double tempoPreparo = 60;	//O tempo de preparo é, em média, 1 hora.
		
		System.out.println("Bem vindo ao nosso restaurante");
		
		System.out.printf("Por favor, digite o seu CPF ");
		String cpf = sc.next();
		String data = "03/07/2021";
		
		Pedido pedido = new Pedido(cpf,data);
		
		System.out.println("Vamos adicionar pratos ao seu pedido.");
		int opcao = 0;
		do {
			System.out.printf("\nDigite 1 para pizza, 2 para sanduiche e 3 para para finalizar seu pedido: ");
			opcao = sc.nextInt();
			if(opcao == 1) {
				System.out.printf("Digite o tipo de molho (Bolonhesa, Quatro Queijos, Tomate): ");
				String molho = sc.next();
				System.out.printf("Digite o tipo de recheio (Calabresa, Marguerita, Manjericão): ");
				String recheio = sc.next();
				System.out.printf("Digite o tipo de borda (Tradicional, Cheedar, Chocolate): ");
				String borda = sc.next();
				Pizza p = new Pizza(custo, precoVenda, tempoPreparo, molho, recheio, borda);
				pedido.adicionaPrato(p);
			}
			else if(opcao == 2) {
				System.out.printf("Digite o tipo de pão (Francês, Australiano, Pão de Batata): ");
				String pão = sc.next();
				System.out.printf("Digite o tipo de carne (Angus, Frango): ");
				String carne = sc.next();
				System.out.printf("Digite o tipo de salada (Tomate, Alface): ");
				String salada = sc.next();
				Sanduiche s = new Sanduiche(custo, precoVenda, tempoPreparo, pão, carne, salada);
				pedido.adicionaPrato(s);
			}
			else if(opcao == 3) break;
			else
				System.out.println("Valor inválido!");
		}while(opcao!=3);
		
		System.out.println("Seu pedido ficará pronto em 60 minutos");
		System.out.println("O valor total dos pratos: " + pedido.calculaTotalPratos());
		System.out.println("A taxa: " + pedido.calculaTaxa());
		System.out.println("O valor total do pedido: " + pedido.calculaPedido());
		System.out.println("Agradecemos a preferência");
		
		sc.close();

	}

}
