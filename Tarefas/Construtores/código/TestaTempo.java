package código;

public class TestaTempo {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao Testa Tempo!");
		System.out.printf("Vamos setar nossos objetos com construtores\n\n");
		
		Tempo tempo = new Tempo(1,20,24);
		Tempo tempo2 = new Tempo(tempo);
		
		System.out.println("Horas 1: " + tempo.imprimeTempo());
		System.out.println("Horas 2: " + tempo2.imprimeTempo());
		
		System.out.printf("\nSe incrementarmos os minutos:\n");
		tempo.incrementaMinuto();
		System.out.println("Horas 1: " + tempo.imprimeTempo());
		
		System.out.printf("\nSe decrementarmos os minutos:\n");
		tempo2.decrementaMinuto();
		System.out.println("Horas 2: " + tempo2.imprimeTempo());
		
		System.out.printf("\nSe tentarmos colocar valores inválidos nos construtores:\n");
		Tempo tempo3 = new Tempo(-29);
		System.out.println("Horas 3: " + tempo3.imprimeTempo());
		Tempo tempo4 = new Tempo(25,20);
		System.out.println("Horas 4: " + tempo4.imprimeTempo());
	}

}
