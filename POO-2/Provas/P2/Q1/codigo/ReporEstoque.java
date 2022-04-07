package codigo;

/*Comando concreto, solicita reposição de estoque*/
public class ReporEstoque implements Reposicao{
	
	private Fornecedor fornecedor;

	public ReporEstoque(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	@Override
	public void execute() {
		fornecedor.solicitar();
	}
}
