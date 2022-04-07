package codigo;

public class CancelaEstoque implements Reposicao{
	
	private Fornecedor fornecedor;

	public CancelaEstoque(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	@Override
	public void execute() {
		fornecedor.cancelar();
	}

}
