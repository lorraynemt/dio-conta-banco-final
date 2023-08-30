import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String NomeCliente = scanner.next();

            System.out.println("Digite seu numero: ");
            int Numero = scanner.nextInt();

            System.out.println("Digite sua agência: ");
            String Agencia = scanner.next();

            System.out.println("Digite seu saldo: ");
            double Saldo = scanner.nextDouble();

            System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
        }
    }
}
