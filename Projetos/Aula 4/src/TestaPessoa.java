
public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Elaine";
		p1.idade = 25;
		p1.contador = 1;
		
		System.out.println("Contador: "+ p1.contador);
		
		Pessoa p2 = new Pessoa();
		p2.nome = "João";
		p2.idade = 30;
		p2.contador = p2.contador + 1;
		
		System.out.println("Contador: "+ p2.contador);
		System.out.println("Contador: "+ p1.contador);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		p1.incIdade();
		System.out.println(p1.idade);
		
		System.out.println(p2.nome);
		System.out.println(p2.idade);
		p2.incIdade();
		System.out.println(p2.idade);
		
		//Acesso um atributo com o nome da classe somente por atributos estáticos
		System.out.println(Pessoa.contador);
		

	}

}
