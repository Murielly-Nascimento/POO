package código;

public class Testa {

	public static void main(String[] args) {
		Funcionario f[] = new Funcionario[3];
		f[0] = new Assistente("Aline", "1", 100);
		f[1] = new Gerente("Elena", "2", 100);
		f[2] = new Vendedor("Cassandra", "3", 100,40);
		double total = 0;
		for(int i = 0; i< 3; i++) {
			f[i].mostrarDados();
			total += f[i].calculaSalario();
		}
		System.out.println("Total R$ " + total);
		
		

	}

}
