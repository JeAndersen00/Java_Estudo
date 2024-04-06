package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.println("Enter account name holder: ");
		String nome = sc.next();
		
		double saldo = 0.00;
        
        while (true) {
        	System.out.println("Is there an initial deposit (y/n)?" );
            // Lê a entrada do usuário
            String tecla = sc.next();
            
            // Verifica se a tecla é 'y'
            if (tecla.equalsIgnoreCase("y")) {
            	System.out.println("Enter initial deposit value: ");
                saldo = sc.nextDouble();
                break; // Sai do loop se 'y' for digitado
            }
            // Verifica se a tecla é 'n'
            else if (tecla.equalsIgnoreCase("n")) {
                saldo = 0;
                break; // Sai do loop se 'n' for digitado
            }
            // Se não for 'y' nem 'n', solicita que o usuário digite novamente
            else {
                System.out.println("Invalid key. Please type again");
            }
        }
        //Instanciando o objeto
        Conta conta = new Conta(nome, numConta, saldo);
        
        //Teste de diff
        System.out.println("");
        System.out.println("Account data: ");
        System.out.println("Account " + numConta + " ,Holder " + nome + " ,Balance: $ " + conta.getSaldo());
        
        // Teste de diff 2
        System.out.println("");
        System.out.println("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Account " + numConta + " ,Holder " + nome + " ,Balance: $ " + conta.getSaldo());
        
        System.out.println("");
        System.out.println("Enter a withdraw: ");
        double valorRetirada = sc.nextDouble();
        conta.retirada(valorRetirada);
        System.out.println("Account " + numConta + " ,Holder " + nome + " ,Balance: $ " + conta.getSaldo());
        
        sc.close();
	}

}
