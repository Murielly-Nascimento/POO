package futurista;


public abstract class Campo {
	
	private Campo sucessor;
	
	private int defesa;
	private String descricao;

	public Campo getSucessor() {
		return sucessor;
	}

	public void setSucessor(Campo sucessor) {
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

	public void processaCampo(int valor) {
		
		//Dano o valor que o campo n�o conseguiu defender
		//Exemplo: Campo(100) - Valor(200) = -100(Ataque que o pr�ximo campo deve cobrir)
		int dano = getDefesa() - valor;

		if(dano < 0) {
			//Fa�o o dano ficar positivo
			dano *= -1;
			setDefesa(0);
			if(getSucessor()==null) {
				System.out.println("N�o h� mais campos a serem processados");
				return;
			}
			else getSucessor().processaCampo(dano);
		}
		
		else if(dano > 0)
			setDefesa(dano);
		
		System.out.println("Vida do campo " + getDefesa());
		System.out.println("Tipo do campo " + getDescricao());

	}

}