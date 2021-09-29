package código;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaSupermercado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao supermecado X!");
		
		Produto p = new Produto("arroz", 21.5, 3);
		Produto p2 = new Produto("feijão", 21.5, 3);
		
		Item[] i = new Item [2];
		i[0] = new Item(2,p);
		i[1] = new Item(3,p2);
		
		Pedido primeiro = new Pedido("dinheiro");
		primeiro.adicionaItem(i[0]);
		primeiro.adicionaItem(i[1]);
		
		System.out.println("Pedido");
		System.out.print("Produtos: " + primeiro.getItens().get(0).getProduto().getNome());
		System.out.println("Quantidade: " + primeiro.getItens().get(0).getQuantidade());
		System.out.println("R$ " + primeiro.getItens().get(0).getProduto().getPreco());
		
		System.out.print("Produtos: " + primeiro.getItens().get(1).getProduto().getNome());
		System.out.println("Quantidade: " + primeiro.getItens().get(1).getQuantidade());
		System.out.println("R$ " + primeiro.getItens().get(1).getProduto().getPreco());
		
		double total = primeiro.getItens().get(0).getProduto().getPreco() * primeiro.getItens().get(0).getQuantidade();
		total += primeiro.getItens().get(1).getProduto().getPreco() * primeiro.getItens().get(1).getQuantidade();
		
		System.out.println("Total R$ " + total);
		
		sc.close();
		
	}

}
