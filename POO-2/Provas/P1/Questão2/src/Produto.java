
public class Produto {
	
		private int quantidade;
		private Estado estado;
		private String descricao;
		
		public Produto(String descricao) {
			//Os produtos começam por default no estado Indisponível
			setEstado(new EstadoIndisponivel(this));
			setQuantidade(0);
			setDescricao(descricao);
		}
		
		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public Estado getEstado() {
			return estado;
		}
		public void setEstado(Estado estado) {
			this.estado = estado;
		}
		
		public void compra(int quantia) {
			estado.comprar(quantia);
			System.out.println("Compra de " + quantia + " unidades de " + this.getDescricao());
			System.out.println("Estoque de " + this.getQuantidade() + " unidades de " + this.getDescricao());
			System.out.println("Estado " + this.estado.getClass().getName());
			System.out.println("------------");
		}
		
		public void venda(int quantia) {
			estado.vender(quantia);
			System.out.println("Venda de " + quantia + " unidades de " + this.getDescricao());
			System.out.println("Estoque de " + this.getQuantidade() + " unidades de " + this.getDescricao());
			System.out.println("Estado " + this.estado.getClass().getName());
			System.out.println("------------");
		}
		
		

}
