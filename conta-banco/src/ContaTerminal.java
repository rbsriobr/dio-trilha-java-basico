import java.util.*;

/**
 * @author Ricardo Barbosa dos Santos
 * @version 0.1
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US) ;

        System.out.println("\n\nPor favor, digite o nome do cliente");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o número da conta");
        numero = scan.nextInt();

        System.out.println("Digite o número da agência");
        agencia = scan.next();

        System.out.println("Digite o saldo da conta");
        saldo = scan.nextDouble();
 
        scan.close();

        String out = 
        "\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
        "sua agência é " + agencia + ", conta " + String.valueOf(numero) + 
        " e seu saldo " + String.valueOf(saldo) + " já está disponível para saque\n";
        System.out.println(out);
    }
}
