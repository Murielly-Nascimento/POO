package codigo;

public class Cliente {

	public static void main(String[] args) {
				
		Fornecedor fornecedor = new Fornecedor();
		
		Reposicao reporEstoque = new ReporEstoque(fornecedor);
		Reposicao cancelaEstoque = new CancelaEstoque(fornecedor);
		
		DepCompras departamento = new DepCompras();
		departamento.guardaPedido(reporEstoque);
		departamento.guardaPedido(cancelaEstoque);

	}

}
