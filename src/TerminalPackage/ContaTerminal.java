package TerminalPackage;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
	
	
	String nomeCliente = "";
	
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	
	System.out.println ("Digite o número da Agêmcia!");
		int numero = scanner.nextInt(); 
	 
	System.out.println ("Digite o número da Conta!");
	 	String conta = scanner.next();
	
	System.out.println ("Digite o seu  primeiro nome!");
		String primeiroNome = scanner.next();
	 
		
	System.out.println ("Digite o seu  primeiro nome!");
		String segundoNome = scanner.next();
		
		nomeCliente = (primeiroNome+" "+segundoNome);
	 
	System.out.println ("Digite o seu Saldo!");
	 	double saldo = scanner.nextDouble();
	
	System.out.flush();
	 
	 System.out.println ("Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+numero+" e seu saldo R$"+saldo+" já está disponível para saque!");
}
}
