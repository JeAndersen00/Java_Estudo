package entities;

public class Conta {

	private String nome;
	private int numConta;
	private double saldo;
	
	public Conta(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}
	
	public Conta(String nome, int numConta, double saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void retirada(double valorRetirada) {
		this.saldo -= valorRetirada + 5.00;
	}
	
}
