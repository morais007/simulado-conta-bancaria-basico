import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite sua agência: ");
        agencia = scanner.nextLine();
        System.out.println("Digite o numero da conta: ");
        numero = scanner.nextInt();
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta "+numero+ " e seu saldo " + saldo + "já está disponivel para saque.");
    }
}
