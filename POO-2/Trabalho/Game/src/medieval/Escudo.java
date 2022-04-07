package medieval;


public abstract class Escudo {
	
	private Escudo sucessor;
	
	private int defesa;
	private String descricao;

	public Escudo getSucessor() {
		return sucessor;
	}

	public void setSucessor(Escudo sucessor) {
		this.sucessor = sucessor;
	}
	
	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void processaEscudo(int valor) {
		
		//Dano o valor que o escudo não conseguiu defender
		//Exemplo: Escudo(100) - Valor(200) = -100(Ataque que o próximo escudo deve cobrir)
		int dano = getDefesa() - valor;

		if(dano < 0) {
			//Faço o dano ficar positivo
			dano *= -1;
			setDefesa(0);
			if(getSucessor()==null) {
				System.out.println("Não há mais escudos a serem processados");
				return;
			}
			else getSucessor().processaEscudo(dano);
		}
		
		else if(dano > 0)
			setDefesa(dano);
		
		System.out.println("Vida do escudo " + getDefesa());
		System.out.println("Tipo do escudo " + getDescricao());

	}

}