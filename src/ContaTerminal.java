import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero = 1021;
		System.out.print("DIGITE O NUMERO DA AGÊNCIA: ");
		String agencia = ler.next();
		System.out.print("DIGITE O NOME DO CLIENTE: ");
		String cliente = ler.next();
		double saldo = 237.48;

		
		System.out.println("olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}
