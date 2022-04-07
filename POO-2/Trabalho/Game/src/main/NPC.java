package main;

import java.util.Observable;

public abstract class NPC extends Observable{
	
	//ATRIBUTOS
	
	private int life;
	private Estado estado;
	
	private Corrida corrida;
	private Ataque ataque;
	private Pulo pulo;
	
	//Coordenadas do NPC (X,Y)
	private int X;
	private int Y;
	
	//CONSTRUTOR
	public NPC(int X, int Y) {
		setLife(100);
		setX(X);
		setY(Y);
		setEstado(new EstadoNormal(this));
	}
	
	//GETTERS AND SETTERS
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Corrida getCorrida() {
		return corrida;
	}
	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}
	public Ataque getAtaque() {
		return ataque;
	}
	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}
	public Pulo getPulo() {
		return pulo;
	}
	public void setPulo(Pulo pulo) {
		this.pulo = pulo;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}

	//MÉTODOS
	public void moverEsq() {
		setX(getX()  - 10);
	}
	public void moverDir() {
		setX(getX()  + 10);
	}
	public void moverCima() {
		setY(getY()  - 10);
	}
	public void moverBaixo() {
		setY(getY()  + 10);
	}
	
	public int atacar(){
        return ataque.atacar();
    }
    
    public void pular(){
        pulo.pular();
    }
    
    public void correr(){
        corrida.correr();
    }
    
	public void ganhoEnergia(int valor) {
		this.estado.ganhoEnergia(valor);
		System.out.println("Life: " + this.getLife());
		System.out.println("Estado: " + this.estado.getClass().getName());
	}
	
	public void perdaEnergia(int valor) {
		this.estado.perdaEnergia(valor);
		System.out.println("Life: " + this.getLife());
		System.out.println("Estado: " + this.estado.getClass().getName());
	}
		

	
	

}