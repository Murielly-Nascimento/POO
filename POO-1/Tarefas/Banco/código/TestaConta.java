package código;

import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaPoupança[] cp = new ContaPoupança[5];
		ContaEspecial[] ce = new ContaEspecial[5];
		
		System.out.println();
		System.out.println("Insira os dados de 5 contas poupança");
		
		for(int i=0; i<5; i++) {
			System.out.printf("\nDigite os dados da conta %d\n", (i + 1));
			System.out.printf("Digite o CPF: ");
			int cpf = sc.nextInt();
			
			System.out.printf("Digite o número da conta: ");
			int nro = sc.nextInt();
			
			System.out.printf("Digite o saldo: ");
			double saldo = sc.nextDouble();
			
			System.out.printf("Digite a taxa de rendimento da conta: ");
			double taxa = sc.nextDouble();
			
			cp[i] = new ContaPoupança(cpf,nro,saldo,taxa);
			
		}
		
		System.out.println();
		System.out.println("Insira os dados de 5 contas especiais");
		
		for(int i=0; i<5; i++) {
			System.out.printf("\nDigite os dados da conta %d\n",(i + 1));
			System.out.printf("Digite o CPF: ");
			int cpf = sc.nextInt();
			
			System.out.printf("Digite o número da conta: ");
			int nro = sc.nextInt();
			
			System.out.printf("Digite o saldo: ");
			double saldo = sc.nextDouble();
			
			System.out.printf("Digite o limite da conta: ");
			double limite = sc.nextDouble();
			
			ce[i] = new ContaEspecial(cpf,nro,saldo,limite);
			
		}
		System.out.println();
		System.out.println("Saldo da conta Poupança 1: " + cp[0].getSaldo());
		cp[0].rendimento();
		System.out.printf("Saldo da conta Poupança 1 atualizado: %.2f\n",cp[0].getSaldo());
		
		System.out.println("Conta Especial 2: " + ce[2].getSaldo());
		System.out.println("Digite um valor para saque: ");
		double saque = sc.nextDouble();
		ce[2].saque(saque);
		System.out.println("Conta Especial 2 atualizado: " + ce[2].getSaldo());
		
		
		
		
		
		
		sc.close(); 
		
	}

}
